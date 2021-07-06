package com.issac.BinaryTree;

import java.util.ArrayList;

public class BinarySearchTree {
    int data;
    BinarySearchTree left = null;
    BinarySearchTree right = null;

    public BinarySearchTree(int data){
        this.data = data;
    }

    public void add(int data) {
        if (data < this.data) {
            if (this.left == null ) {
                this.left = new BinarySearchTree(data);
            } else {
                this.left.add(data);
            }
        } else if (data > this.data) {
            if (this.right == null) {
                this.right = new BinarySearchTree(data);
            } else {
                this.right.add(data);
            }
        }
    }

    public DynamicArray preOrderTraversal(){
        DynamicArray elements = new DynamicArray();

        elements.append(this.data);
        if(this.left != null){
            elements.append(this.left.preOrderTraversal());
        }
        if(this.right != null){
            elements.append(this.right.preOrderTraversal());
        }
        return elements;
    }
    public DynamicArray inOrderTraversal(){
        DynamicArray elements = new DynamicArray();

        if(this.left != null){
            elements.append(this.left.inOrderTraversal());
        }
        elements.append(this.data);
        if(this.right != null){
            elements.append(this.right.inOrderTraversal());
        }
        return elements;
    }

    public DynamicArray postOrderTraversal(){
        DynamicArray elements = new DynamicArray();

        if(this.left != null){
            elements.append(this.left.postOrderTraversal());
        }
        if(this.right != null){
            elements.append(this.right.postOrderTraversal());
        }
        elements.append(this.data);
        return elements;
    }

    public DynamicArray levelOrderTraversal() throws Exception {
        DynamicArray elements = new DynamicArray();
        QueueLinkedList queue = new QueueLinkedList();
        DynamicArray final_list = new DynamicArray();
        queue.enqueue(this);
        while(!queue.isEmpty()) {
            BinarySearchTree node = queue.dequeue();
            final_list.append(node.data);
            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
        }
        return final_list;
    }

    @Override
    public String toString() {
        String x = null;
        try {
             x = levelOrderTraversal().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
}
