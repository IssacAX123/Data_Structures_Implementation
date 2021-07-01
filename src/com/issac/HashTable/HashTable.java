package com.issac.HashTable;

import com.issac.HashTable.DoubleyLinkedList.DoubleyLinkedList;

import java.util.Arrays;

public class HashTable {
    DoubleyLinkedList[] table = new DoubleyLinkedList[12];

    public HashTable(){
        for(int i = 0; i<12; i++){
            table[i] = new DoubleyLinkedList();
        }
    }

    public void add(String key, int data) {
        int ogIndex = hashKey(key);
        int mainIndex = ogIndex;
        if (table[ogIndex].getSize() > 12) {
            boolean loopBreaker = false;
            while(!loopBreaker){
                mainIndex += 3;
                mainIndex %= 12;
                if (table[mainIndex].getSize() < table[ogIndex].getSize() || mainIndex == ogIndex) {
                    loopBreaker = true;
                }
            }
        }
        table[mainIndex].append(key, data);
    }

    public int get(String key) throws Exception {
        int ogIndex = hashKey(key);
        int mainIndex = ogIndex;
        java.lang.Integer result = valueReturner(mainIndex, key, ogIndex, true);
        if(result == null){
            throw new Exception("key not in HashTable");
        }
        return result;
    }

    private java.lang.Integer valueReturner(int index, String key, int ogIndex, boolean first){
        java.lang.Integer result = table[index].find(key);
        if(index == ogIndex && !first){
            return null;
        }
        if(result == null){
            first = false;
            valueReturner((index+3)%12, key, ogIndex, first);
        }
        return result;
    }
    private int hashKey(String key){
        char character;
        int ascii;
        int total = 0;
        for(int i = 0; i <key.length(); i++){
            character = key.charAt(i);
            ascii = (int) character;
            total += ascii;
        }
        return total % 12;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
