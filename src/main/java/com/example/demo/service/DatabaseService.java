package com.example.demo.service;
import com.example.demo.entity.DmsContent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/sqljdbc";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Hari2002haran@h2";

    public static void saveDmsContent(DmsContent dmsContent) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO fg_dms_content " +
                    "(ID, DMS_DOC_PATH, DMS_DOC_REFERENCE_ID, FILE_CONTENT, FILE_NAME, FILE_SIZE, FILE_TYPE, " +
                    "TITLE, DMS_EVENT_ID, DESCRIPTION, FILE_PURPOSE_CODE, DMS_REFERENCE, ACTIVE_CODE, " +
                    "STATUS_CODE, CREATED_ON, CREATED_BY, LAST_UPDATED_BY, LAST_AUTHORISED_ON, LAST_AUTHORISED_BY) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, dmsContent.getId());
                statement.setString(2, dmsContent.getDmsDocPath());
                statement.setString(3, dmsContent.getDmsDocReferenceId());
                statement.setBytes(4, dmsContent.getFileContent());
                statement.setString(5, dmsContent.getFileName());
                statement.setString(6, dmsContent.getFileSize());
                statement.setString(7, dmsContent.getFileType());
                statement.setString(8, dmsContent.getTitle());
                statement.setInt(9, dmsContent.getDmsEventId());
                statement.setString(10, dmsContent.getDescription());
                statement.setString(11, dmsContent.getFilePurposeCode());
                statement.setString(12, dmsContent.getDmsReference());
                statement.setString(13, dmsContent.getActiveCode());
                statement.setString(14, dmsContent.getStatusCode());
                statement.setTimestamp(15, java.sql.Timestamp.valueOf(dmsContent.getCreatedOn()));
                statement.setInt(16, dmsContent.getCreatedBy());
                statement.setInt(17, dmsContent.getLastUpdatedBy());
                statement.setTimestamp(18, java.sql.Timestamp.valueOf(dmsContent.getLastAuthorisedOn()));
                statement.setInt(19, dmsContent.getLastAuthorisedBy());


                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
