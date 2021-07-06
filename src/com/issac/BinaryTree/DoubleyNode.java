package com.issac.BinaryTree;

public class DoubleyNode {
    public DoubleyNode prev = null;
    public DoubleyNode next = null;
    BinarySearchTree data;

    public DoubleyNode(BinarySearchTree data){
        this.data = data;
    }
}
