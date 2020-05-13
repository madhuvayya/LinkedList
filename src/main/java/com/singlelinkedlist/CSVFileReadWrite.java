package com.singlelinkedlist;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReadWrite {

    private static final String INPUT_CSV_FILE = "./src/main/resources/input.csv";

    public List<String> readCSVFile() {
        List<String> list = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(INPUT_CSV_FILE));
            CSVReader csvReader = new CSVReader(reader);
            String[] records;
            while (( records = csvReader.readNext()) != null) {
                list.add(records[0]);
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return list;
    }
}
