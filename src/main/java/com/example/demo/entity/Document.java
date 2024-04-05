package com.example.demo.entity;
import java.time.LocalDateTime;

public class Document {
    private int id;
    private String dmsDocPath;
    private int dmsDocReferenceId;
    private String fileContent;
    private String fileName;
    private long fileSize;
    private String fileType;
    private String title;
    private int dmsEventId;
    private String description;
    private int filePurposeCode;
    private String dmsReference;
    private char activeCode;
    private String statusCode;
    private LocalDateTime createdOn;
    private String createdBy;
    private String lastUpdatedBy;
    private LocalDateTime lastAuthorisedOn;
    private String lastAuthorisedBy;

    // Constructor
    public Document() {
    }

    // Getters and Setters
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

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
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

    public char getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(char activeCode) {
        this.activeCode = activeCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
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

    public LocalDateTime getLastAuthorisedOn() {
        return lastAuthorisedOn;
    }

    public void setLastAuthorisedOn(LocalDateTime lastAuthorisedOn) {
        this.lastAuthorisedOn = lastAuthorisedOn;
    }

    public String getLastAuthorisedBy() {
        return lastAuthorisedBy;
    }

    public void setLastAuthorisedBy(String lastAuthorisedBy) {
        this.lastAuthorisedBy = lastAuthorisedBy;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", dmsDocPath='" + dmsDocPath + '\'' +
                ", dmsDocReferenceId=" + dmsDocReferenceId +
                ", fileContent='" + fileContent + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", fileType='" + fileType + '\'' +
                ", title='" + title + '\'' +
                ", dmsEventId=" + dmsEventId +
                ", description='" + description + '\'' +
                ", filePurposeCode=" + filePurposeCode +
                ", dmsReference='" + dmsReference + '\'' +
                ", activeCode=" + activeCode +
                ", statusCode='" + statusCode + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastAuthorisedOn=" + lastAuthorisedOn +
                ", lastAuthorisedBy='" + lastAuthorisedBy + '\'' +
                '}';
    }
}
