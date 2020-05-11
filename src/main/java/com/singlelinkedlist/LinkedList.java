package com.singlelinkedlist;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LinkedList {

    private static final String INPUT_CSV_FILE = "./src/main/resources/input.csv";

    public boolean searchWord(String value) throws IOException {
        CSVReader csvReader;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(INPUT_CSV_FILE));
            csvReader = new CSVReader(reader);
            String[] strings;
            while (( strings = csvReader.readNext()) != null) {
                if(value.compareTo(strings[0])==0)
                    return true;
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return false;
    }
}
