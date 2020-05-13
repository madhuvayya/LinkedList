package com.singlelinkedlist;

import java.util.List;

class Node<T> {
    T data;
    Node next;
}

public class LinkedList<T extends Comparable> {

    private LinkedList<T> linkedList;
    Node head;

    private int numberOfNodes=0;
    private List<String> strings;

    private void readCSVFile() {
        CSVFileReadWrite csvFileReadWrite = new CSVFileReadWrite();
        strings = csvFileReadWrite.readCSVFile();
    }

    public <T extends Comparable> boolean searchWord(T element) {
        readCSVFile();
        if(strings.contains(element)) {
            return true;
        }
        strings.add((String) element);
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

    public <T extends Comparable> void remove(T item) {
        if (linkedList.searchWord(item)) {
            if (head == null) {
            } else {
                Node currentNode = head;
                int index = 0;
                while (currentNode.data == item) {
                    index++;
                }
                removeAt(index);
            }
        }
    }

    private <T extends Comparable> void removeAt(int index) {
        if ( index == 0 ){
            head = head.next;
        }else {
             Node currentNode = head;
             Node nextNode = null;
             for (int i=0;i<index-1;i++){
                 currentNode=currentNode.next;
             }
             nextNode = currentNode.next;
             currentNode.next = nextNode.next;
             nextNode=null;
             numberOfNodes--;
        }

    }
}
