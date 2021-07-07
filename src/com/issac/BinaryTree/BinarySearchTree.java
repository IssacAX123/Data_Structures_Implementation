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
    public boolean search(int data){
        boolean result = false;
        if(data < this.data){
            if(this.left != null){
                result = this.left.search(data);
            }else{
                result = false;
            }
        }else if(data > this.data) {
            if(this.right != null){
                result = this.right.search(data);
            }else {
                result = false;
            }
        } else{
            result = true;
        }
        return result;
    }
    public int getMin(){
        if(this.left == null){
            return this.data;
        }
        return this.left.getMin();
    }

    public int getMax(){
        if(this.right == null){
            return this.data;
        }
        return this.right.getMin();
    }

    public BinarySearchTree delete(int data){
        if(data < this.data) {
            this.left = this.left.delete(data);
        } else if(data > this.data) {
            this.right = this.right.delete(data);
        } else {
            // node with no leaf nodes
            if(this.left == null && this.right == null) {
                return null;
            } else if(this.left == null) {
                return this.right;
            } else if(this.right == null) {
                return this.left;
            } else {
                int minValue = getMin();
                this.data = minValue;
                this.left = this.left.delete(minValue);
            }
        }
        return this;
    }

    @Override
    public String toString() {
        String x = null;
        try {
             x = preOrderTraversal().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
}
