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

    @Override
    public String toString() {
        return inOrderTraversal().toString();
    }
}
