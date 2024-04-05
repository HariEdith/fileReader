package com.example.demo.service;
import com.example.demo.entity.DmsContent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String csvFile = "E:\\sample.csv";
        String line = "";
        String csvSplitBy = ",";
        List<DmsContent> dmsContentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split the line using the comma delimiter
                String[] data = line.split(csvSplitBy);

                // Map CSV data to DmsContent object
                DmsContent dmsContent = new DmsContent();
                dmsContent.setId(Integer.parseInt(data[0]));
                dmsContent.setDmsDocPath(data[1]);
                dmsContent.setDmsDocReferenceId(data[2]);

                File csvFileObject = new File("E:\\sample.csv");
                byte[] fileContent = Files.readAllBytes(csvFileObject.toPath());
                dmsContent.setFileContent(fileContent);
                dmsContent.setFileContent(data[3].getBytes());

                dmsContent.setFileName(data[4]);
                dmsContent.setFileSize(data[5]);
                dmsContent.setFileType(data[6]);
                dmsContent.setTitle(data[7]);
                dmsContent.setDmsEventId(Integer.parseInt(data[8]));
                dmsContent.setDescription(data[9]);
                dmsContent.setFilePurposeCode(data[10]);
                dmsContent.setDmsReference(data[11]);
                dmsContent.setActiveCode(data[12]);
                dmsContent.setStatusCode(data[13]);

                // Parse LocalDateTime fields
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime createdOn = LocalDateTime.parse(data[14], formatter);
                dmsContent.setCreatedOn(createdOn);

                dmsContent.setCreatedBy(Integer.parseInt(data[15]));
                dmsContent.setLastUpdatedBy(Integer.parseInt(data[16]));

                LocalDateTime lastUpdatedOn = LocalDateTime.parse(data[17], formatter);
                dmsContent.setLastAuthorisedOn(lastUpdatedOn);

                dmsContent.setLastAuthorisedBy(Integer.parseInt(data[18]));

                // Add DmsContent object to the list
                dmsContentList.add(dmsContent);
                DatabaseService.saveDmsContent(dmsContent);

            }

            // Print DmsContent objects to the console
            for (DmsContent dmsContent : dmsContentList) {

                System.out.println(dmsContent.toString());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
