package com.example.demo.entity;
import java.util.Arrays;
import java.util.Date;

public class Document {
    private int id;
    private String dmsDocPath;
    private int dmsDocReferenceId;
    private byte[] fileContent;
    private String fileName;
    private int fileSize;
    private String fileType;
    private String title;
    private int dmsEventId;
    private String description;
    private int filePurposeCode;
    private String dmsReference;
    private String activeCode;
    private String statusCode;
    private String createdOn;
    private String createdBy;
    private String lastUpdatedBy;
    private String lastAuthorizedOn;
    private String lastAuthorizedBy;

    public Document(int id, String dmsDocPath, int dmsDocReferenceId, byte[] fileContent, String fileName,
                    int fileSize, String fileType, String title, int dmsEventId, String description,
                    int filePurposeCode, String dmsReference, String activeCode, String statusCode,
                    String createdOn, String createdBy, String lastUpdatedBy, String lastAuthorizedOn,
                    String lastAuthorizedBy) {
        this.id = id;
        this.dmsDocPath = dmsDocPath;
        this.dmsDocReferenceId = dmsDocReferenceId;
        this.fileContent = fileContent;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.title = title;
        this.dmsEventId = dmsEventId;
        this.description = description;
        this.filePurposeCode = filePurposeCode;
        this.dmsReference = dmsReference;
        this.activeCode = activeCode;
        this.statusCode = statusCode;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastAuthorizedOn = lastAuthorizedOn;
        this.lastAuthorizedBy = lastAuthorizedBy;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDmsDocPath() {
        return dmsDocPath;
    }

    public void setDmsDocPath(String dmsDocPath) {
        this.dmsDocPath = dmsDocPath;
    }

    public int getDmsDocReferenceId() {
        return dmsDocReferenceId;
    }

    public void setDmsDocReferenceId(int dmsDocReferenceId) {
        this.dmsDocReferenceId = dmsDocReferenceId;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDmsEventId() {
        return dmsEventId;
    }

    public void setDmsEventId(int dmsEventId) {
        this.dmsEventId = dmsEventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFilePurposeCode() {
        return filePurposeCode;
    }

    public void setFilePurposeCode(int filePurposeCode) {
        this.filePurposeCode = filePurposeCode;
    }

    public String getDmsReference() {
        return dmsReference;
    }

    public void setDmsReference(String dmsReference) {
        this.dmsReference = dmsReference;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastAuthorizedOn() {
        return lastAuthorizedOn;
    }

    public void setLastAuthorizedOn(String lastAuthorizedOn) {
        this.lastAuthorizedOn = lastAuthorizedOn;
    }

    public String getLastAuthorizedBy() {
        return lastAuthorizedBy;
    }

    public void setLastAuthorizedBy(String lastAuthorizedBy) {
        this.lastAuthorizedBy = lastAuthorizedBy;
    }

   
//    @Override
//    public String toString() {
//        return "Document{" +
//                "id=" + id +
//                ", dmsDocPath='" + dmsDocPath + '\'' +
//                ", dmsDocReferenceId=" + dmsDocReferenceId +
//                ", fileContent=" + Arrays.toString(fileContent) +
//                ", fileName='" + fileName + '\'' +
//                ", fileSize=" + fileSize +
//                ", fileType='" + fileType + '\'' +
//                ", title='" + title + '\'' +
//                ", dmsEventId=" + dmsEventId +
//                ", description='" + description + '\'' +
//                ", filePurposeCode=" + filePurposeCode +
//                ", dmsReference='" + dmsReference + '\'' +
//                ", activeCode='" + activeCode + '\'' +
//                ", statusCode='" + statusCode + '\'' +
//                ", createdOn='" + createdOn + '\'' +
//                ", createdBy='" + createdBy + '\'' +
//                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
//                ", lastAuthorizedOn='" + lastAuthorizedOn + '\'' +
//                ", lastAuthorizedBy='" + lastAuthorizedBy + '\'' +
//                '}';
//    }
}
