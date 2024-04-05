package com.example.demo.service;

import com.example.demo.entity.Document;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvFile = "D:\\Hari\\docs\\sample.csv";
        String cvsSplitBy = ",";

        List<Document> documents = new ArrayList<>();

   
            List<String> lines = Files.readAllLines(Paths.get(csvFile), StandardCharsets.UTF_8);
           
            lines.remove(0);

            for (String line : lines) {
                String[] data = line.split(cvsSplitBy);

                Document document = new Document(
                        Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),null,data[4],Integer.parseInt(data[5]),data[6],data[7],
                        Integer.parseInt(data[8]),data[9],Integer.parseInt(data[10]), data[11],data[12],data[13],data[14],data[15],data[16],data[17], data[18]
                );
                documents.add(document);
            }

            for (String line : lines) {
                String[] data = line.split(cvsSplitBy);
                System.out.println(Arrays.toString(data)); 

            }
    }
}
