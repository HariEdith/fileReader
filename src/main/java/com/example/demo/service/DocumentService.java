package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.format.DateTimeParseException;


import com.example.demo.entity.Document;

public class DocumentService {
    private static final Logger LOGGER = Logger.getLogger(DocumentService.class.getName());
    
    public static void main(String[] args) {
        DocumentService documentService = new DocumentService();
        LOGGER.info("Starting DocumentService...");
        // Read documents from CSV
        List<Document> documents = documentService.readDocumentsFromCSV("D:\\Hari\\docs\\sample.csv");
        for (Document document : documents) {
            System.out.println("Document data:");
            System.out.println("ID: " + document.getId());
            System.out.println("DMS Doc Path: " + document.getDmsDocPath());
            System.out.println("---------------------------------");
        }
        
        documentService.saveDocumentsToDatabase(documents);
    }

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public List<Document> readDocumentsFromCSV(String filePath) {
        List<Document> documents = new ArrayList<>();
        String line;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Document document = new Document();
                try {
                    document.setId(Long.parseLong(data[0]));
                    document.setDmsDocPath(data[1]);
                    document.setDmsDocReferenceId(data[2]); 
                    document.setFileContent(data[3].getBytes()); 
                    document.setFileName(data[4]);
                    document.setFileSize(data[5]);
                    document.setFileType(data[6]);
                    document.setTitle(data[7]);
                    document.setDmsEventId(Long.parseLong(data[8]));
                    document.setDescription(data[9]);
                    document.setFilePurposeCode(data[10]);
                    document.setDmsReference(data[11]);
                    document.setActiveCode(data[12]);
                    document.setStatusCode(data[13]);
                    document.setCreatedOn(LocalDateTime.parse(data[14], formatter)); 
                    document.setLastUpdatedOn(LocalDateTime.parse(data[15], formatter));
                    document.setLastAuthorisedOn(LocalDateTime.parse(data[16], formatter));
                    documents.add(document);
                    LOGGER.info(" readed...");
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | DateTimeParseException e) {
                    LOGGER.log(Level.WARNING, "Error parsing CSV line: " + line, e);
                }
                
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error reading CSV file: " + filePath, e);
        }
        return documents;
    }

    public void saveDocumentsToDatabase(List<Document> documents) {
        String jdbcUrl = "jdbc:oracle:thin:@192.168.1.49:1521:fin";
        String username = "FG_DEMO_IR";
        String password = "FG_DEMO_IR";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            for (Document document : documents) {
                String sql = "INSERT INTO fg_dms_content " +
                        "(ID, DMS_DOC_PATH, DMS_DOC_REFERENCE_ID, FILE_CONTENT, FILE_NAME, FILE_SIZE, FILE_TYPE, " +
                        "TITLE, DMS_EVENT_ID, DESCRIPTION, FILE_PURPOSE_CODE, DMS_REFERENCE, ACTIVE_CODE, " +
                        "STATUS_CODE, CREATED_ON, CREATED_BY, LAST_UPDATED_BY, LAST_AUTHORISED_ON, LAST_AUTHORISED_BY) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setLong(1, document.getId());
                    pstmt.setString(2, document.getDmsDocPath());
                    pstmt.setString(3, document.getDmsDocReferenceId());
                    pstmt.setBytes(4, document.getFileContent());
                    pstmt.setString(5, document.getFileName());
                    pstmt.setString(6, document.getFileSize());
                    pstmt.setString(7, document.getFileType());
                    pstmt.setString(8, document.getTitle());
                    pstmt.setLong(9, document.getDmsEventId());
                    pstmt.setString(10, document.getDescription());
                    pstmt.setString(11, document.getFilePurposeCode());
                    pstmt.setString(12, document.getDmsReference());
                    pstmt.setString(13, document.getActiveCode());
                    pstmt.setString(14, document.getStatusCode());
                    pstmt.setTimestamp(15, java.sql.Timestamp.valueOf(document.getCreatedOn()));
                    pstmt.setLong(16, document.getCreatedBy());
                    pstmt.setLong(17, document.getLastUpdatedBy());
                    pstmt.setTimestamp(18, java.sql.Timestamp.valueOf(document.getLastAuthorisedOn()));
                    pstmt.setLong(19, document.getLastAuthorisedBy());

                    pstmt.executeUpdate();
                    LOGGER.info("Document with ID " + document.getId() + " saved to the database.");
                } catch (SQLException e) {
                    LOGGER.log(Level.SEVERE, "Error saving document with ID " + document.getId() + " to the database.", e);
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error connecting to the database.", e);
        }
    }
}
