package com.issac.Tree;

import com.issac.HashTable.HashTable;

public class Main {

    public static void main(String[] args) throws Exception {

        Tree treel4a = new Tree(5);
        Tree treel4b = new Tree(5);
        Tree treel3b = new Tree(25);
        treel3b.add(treel4a);
        treel3b.add(treel4b);

        Tree treel3a = new Tree(5);
        Tree treel2a = new Tree(50);
        treel2a.add(treel3a);
        treel2a.add(treel3b);
        Tree treel2b = new Tree(20);
        Tree treel3c = new Tree(5);
        Tree treel3d = new Tree(4);
        treel2b.add(treel3c);
        treel2b.add(treel3d);
        Tree treel4c = new Tree(2);
        Tree treel4d = new Tree(2);
        treel3d.add(treel4c);
        treel3d.add(treel4d);
        Tree tree = new Tree(1000);
        tree.add(treel2a);
        tree.add(treel2b);

        System.out.println(tree);
    }
}
