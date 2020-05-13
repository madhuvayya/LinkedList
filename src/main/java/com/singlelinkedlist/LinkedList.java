package com.singlelinkedlist;

import java.util.List;

public class LinkedList<T extends Comparable> {

    private class Node<T> {
        T data;
        Node next;
    }

    private LinkedList<T> linkedList;
    Node head;

    private int numberOfNodes=0;
    private List<String> strings;

    private void readCSVFile() {
        CSVFileReadWrite csvFileReadWrite = new CSVFileReadWrite();
        strings = csvFileReadWrite.readCSVFile();
    }

    public <T> boolean searchWord(T element) {
        readCSVFile();
        if(strings.contains(element))
            return true;
        return false;
    }

    public void list() {
        head = null;
    }

    public int size(){
        return numberOfNodes;
    }

    public <T extends Comparable> void add(T item) {
            if (linkedList.searchWord(item)) {
            }else{
                Node newNode = new Node();
                newNode.data = item;
                if (head == null) {
                    head = newNode;
                } else {
                    Node currentNode = head;
                    while (currentNode.next != null) {
                        currentNode = currentNode.next;
                    }
                    currentNode.next = newNode;
                }
                numberOfNodes++;
            }
    }
}
