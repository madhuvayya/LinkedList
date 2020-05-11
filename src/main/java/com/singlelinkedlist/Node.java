package com.singlelinkedlist;

public class Node<E> {
    E data;
    Node next;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}
