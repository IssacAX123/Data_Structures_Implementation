package com.issac.HashTable.DoubleyLinkedList;

public class DoubleyNode {
    public DoubleyNode prev = null;
    public DoubleyNode next = null;
    String key;
    int data;

    public DoubleyNode(String key, int data){
        this.key = key;
        this.data = data;
    }
}
