package com.issac;

public class DynamicArray {
    int rear_pointer;
    int[] dynamicArray;

    public DynamicArray(){
        rear_pointer = 0;
        dynamicArray = new int[4];
    }

    public boolean isFull(){
        return rear_pointer == dynamicArray.length;
    }
    public boolean isEmpty(){
        return rear_pointer == 0;
    }
}
