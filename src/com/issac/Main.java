package com.issac;

import com.issac.HashTable.HashTable;

public class Main {

    public static void main(String[] args) throws Exception {
        HashTable dictionary = new HashTable();
        dictionary.add("a", 1);
        System.out.println(dictionary);
        dictionary.add("b", 2);
        System.out.println(dictionary);
        dictionary.add("c", 3);
        System.out.println(dictionary);
        dictionary.add("d", 4);
        System.out.println(dictionary);
        dictionary.add("e", 5);
        System.out.println(dictionary);
        dictionary.add("f", 6);
        System.out.println(dictionary);
        dictionary.add("g", 7);
        System.out.println(dictionary);
        dictionary.add("h", 8);
        System.out.println(dictionary);
        dictionary.add("i", 9);
        System.out.println(dictionary);
        dictionary.add("j", 10);
        System.out.println(dictionary);
        dictionary.add("k", 11);
        System.out.println(dictionary);
        dictionary.add("l", 12);
        System.out.println(dictionary);
        dictionary.add("m", 13);
        System.out.println(dictionary);
        dictionary.add("n", 14);
        System.out.println(dictionary);
        dictionary.add("o", 15);
        System.out.println(dictionary);
        dictionary.add("p", 16);
        System.out.println(dictionary);
        System.out.println(dictionary.get("n"));

    }
}
