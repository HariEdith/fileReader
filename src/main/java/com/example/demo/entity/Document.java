package com.example.demo.entity;
import java.time.LocalDateTime;

public class Document {
    private byte[] fileContent;
    private Long lastAuthorisedBy;
    private Long id;
    private Long lastUpdatedBy;
    private Long dmsEventId;
    private Long createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime lastAuthorisedOn;
    private LocalDateTime lastUpdatedOn;
    private String fileType;
    private String description;
    private String fileSize;
    private String dmsDocPath;
    private String dmsDocReferenceId;
    private String statusCode;
    private String activeCode;
    private String title;
    private String fileName;
    private String dmsReference;
    private String filePurposeCode;

    // Getters and Setters

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public Long getLastAuthorisedBy() {
        return lastAuthorisedBy;
    }

    public void setLastAuthorisedBy(Long lastAuthorisedBy) {
        this.lastAuthorisedBy = lastAuthorisedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getDmsEventId() {
        return dmsEventId;
    }

    public void setDmsEventId(Long dmsEventId) {
        this.dmsEventId = dmsEventId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getLastAuthorisedOn() {
        return lastAuthorisedOn;
    }

    public void setLastAuthorisedOn(LocalDateTime lastAuthorisedOn) {
        this.lastAuthorisedOn = lastAuthorisedOn;
    }

    public LocalDateTime getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getDmsDocPath() {
        return dmsDocPath;
    }

    public void setDmsDocPath(String dmsDocPath) {
        this.dmsDocPath = dmsDocPath;
    }

    public String getDmsDocReferenceId() {
        return dmsDocReferenceId;
    }

    public void setDmsDocReferenceId(String dmsDocReferenceId) {
        this.dmsDocReferenceId = dmsDocReferenceId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDmsReference() {
        return dmsReference;
    }

    public void setDmsReference(String dmsReference) {
        this.dmsReference = dmsReference;
    }

    public String getFilePurposeCode() {
        return filePurposeCode;
    }

    public void setFilePurposeCode(String filePurposeCode) {
        this.filePurposeCode = filePurposeCode;
    }
}
