package com.issac;

public class DynamicArray {
    int rearPointer;
    int[] dynamicArray;

    public DynamicArray(){
        rearPointer = 0;
        dynamicArray = new int[4];
    }

    public boolean isFull(){
        return rearPointer == dynamicArray.length;
    }
    public boolean isEmpty(){
        return rearPointer == 0;
    }
    public void append(int data){
        if(!isFull()){
            dynamicArray[rearPointer] = data;
        }
        else{
            growArray();
            dynamicArray[rearPointer] = data;
        }
        rearPointer++;
    }
    public void insertAt(int pos, int data){
        if(!isFull()){
            shiftArrayRight(pos);
            dynamicArray[pos] = data;
        }
        else{
            growArray();
            shiftArrayRight(pos);
            dynamicArray[pos] = data;
        }
        rearPointer++;
    }

    public int getAtIndex(int index){
        return dynamicArray[index];
    }

    private void growArray() {
        int[] tempArray = new int[dynamicArray.length + 4];
        for (int i = 0; i < dynamicArray.length; i++) {
            tempArray[i] = dynamicArray[i];
        }
        dynamicArray = tempArray;
        // can use System.arraycopy(dynamicArray, 0, tempArray, 0, dynamicArray.length);
    }
    private void shiftArrayRight(int stopPos){
        for(int i = dynamicArray.length-1; i>= stopPos; i--) {
            dynamicArray[i + 1] = dynamicArray[i];
        }
    }
}
