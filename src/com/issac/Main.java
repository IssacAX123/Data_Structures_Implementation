package com.issac;

import com.issac.HashTable.HashTable;

public class Main {

    public static void main(String[] args) throws Exception {
        HashTable dictionary = new HashTable();
        dictionary.add("issac", 19);
        System.out.println(dictionary);
        dictionary.add("j", 10);
        System.out.println(dictionary);
        dictionary.add("hello", 21);
        System.out.println(dictionary);
        dictionary.get("issac");
        System.out.println(dictionary);

    }
}
