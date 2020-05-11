package com.singlelinkedlist;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LinkedList<E> {
    Node head;

    private static final String INPUT_CSV_FILE = "./src/main/resources/input.csv";
    private int numberOfNodes=0;

    public boolean searchWord(E value) throws IOException {
        CSVReader csvReader;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(INPUT_CSV_FILE));
            csvReader = new CSVReader(reader);
            String[] strings;
            while (( strings = csvReader.readNext()) != null) {
                if(value.equals(strings[0]))
                    return true;
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return false;
    }

    public void list() {
        Node linkedList = new Node();
    }

    public int size(){
        return numberOfNodes;
    }
}
