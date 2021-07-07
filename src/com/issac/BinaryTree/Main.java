package com.issac.BinaryTree;


public class Main {

    public static void main(String[] args) throws Exception {
        BinarySearchTree tree = new BinarySearchTree(22);
        tree.add(20);
        tree.add(4);
        tree.add(2);
        tree.add(8);
        tree.add(50);
        tree.add(25);
        tree.delete(4);
        System.out.println(tree);
    }
}
