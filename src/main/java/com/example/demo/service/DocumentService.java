package com.example.demo.service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Document;

public class DocumentService {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public List<Document> readDocumentsFromCSV(String filePath) {
        List<Document> documents = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip the header line
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    // Skip empty lines
                    continue;
                }
                String[] data = line.split(",");
                if (data.length != 19) {
                    System.err.println("Invalid data: " + line);
                    continue; // Skip this line
                }
                Document document = new Document();
                document.setId(parseInt(data[0]));
                document.setDmsDocPath(data[1]);
                document.setDmsDocReferenceId(parseInt(data[2]));
                document.setFileContent(data[3]);
                document.setFileName(data[4]);
                document.setFileSize(parseLong(data[5]));
                document.setFileType(data[6]);
                document.setTitle(data[7]);
                document.setDmsEventId(parseInt(data[8]));
                document.setDescription(data[9]);
                document.setFilePurposeCode(parseInt(data[10]));
                document.setDmsReference(data[11]);
                document.setActiveCode(data[12].charAt(0));
                document.setStatusCode(data[13]);
                document.setCreatedOn(LocalDateTime.parse(data[14], formatter));
                document.setCreatedBy(data[15]);
                document.setLastUpdatedBy(data[16]);
                document.setLastAuthorisedOn(LocalDateTime.parse(data[17], formatter));
                document.setLastAuthorisedBy(data[18]);
                documents.add(document);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return documents;
    }


    private int parseInt(String value) {
        return value.isEmpty() ? 0 : Integer.parseInt(value);
    }

    private long parseLong(String value) {
        return value.isEmpty() ? 0L : Long.parseLong(value);
    }


    public void printDocuments(List<Document> documents) {
        for (Document document : documents) {
            System.out.println(document.toString());
        }
    }

    public static void main(String[] args) {
        DocumentService service = new DocumentService();
        List<Document> documents = service.readDocumentsFromCSV("D:\\Hari\\docs\\sample.csv");
        service.printDocuments(documents);
    }
}
