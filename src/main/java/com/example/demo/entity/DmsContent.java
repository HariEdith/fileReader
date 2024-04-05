package com.example.demo.entity;
import java.time.LocalDateTime;
import java.util.Arrays;

public class DmsContent {
    private int id;//1
    private String dmsDocPath;//2
    private String dmsDocReferenceId;//3
    private byte[] fileContent;//4
    private String fileName;//5
    private String fileSize;//6
    private String fileType;//7
    private String title;//8
    private int dmsEventId;//9
    private String description;//10
    private String filePurposeCode;//11
    private String dmsReference;//12
    private String activeCode;//13
    private String statusCode;//14
    private LocalDateTime createdOn;//15
    private int createdBy;//16
    private int lastUpdatedBy;//17
    private LocalDateTime lastAuthorisedOn;//18
    private int lastAuthorisedBy;//19

    public DmsContent() {
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

    public String getDmsDocReferenceId() {
        return dmsDocReferenceId;
    }

    public void setDmsDocReferenceId(String dmsDocReferenceId) {
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

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
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

    public String getFilePurposeCode() {
        return filePurposeCode;
    }

    public void setFilePurposeCode(String filePurposeCode) {
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

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public LocalDateTime getLastAuthorisedOn() {
        return lastAuthorisedOn;
    }

    public void setLastAuthorisedOn(LocalDateTime lastAuthorisedOn) {
        this.lastAuthorisedOn = lastAuthorisedOn;
    }

    public int getLastAuthorisedBy() {
        return lastAuthorisedBy;
    }

    public void setLastAuthorisedBy(int lastAuthorisedBy) {
        this.lastAuthorisedBy = lastAuthorisedBy;
    }
    @Override
    public String toString() {
        return "DmsContent{" +
                "id=" + id +
                ", dmsDocPath='" + dmsDocPath + '\'' +
                ", dmsDocReferenceId='" + dmsDocReferenceId + '\'' +
                ", fileContent='" + Arrays.toString(fileContent) + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", fileType='" + fileType + '\'' +
                ", title='" + title + '\'' +
                ", dmsEventId=" + dmsEventId +
                ", description='" + description + '\'' +
                ", filePurposeCode='" + filePurposeCode + '\'' +
                ", dmsReference='" + dmsReference + '\'' +
                ", activeCode='" + activeCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy=" + createdBy +
                ", lastUpdatedBy=" + lastUpdatedBy +
                ", lastAuthorisedOn=" + lastAuthorisedOn +
                ", lastAuthorisedBy=" + lastAuthorisedBy +
                '}';
    }

}
