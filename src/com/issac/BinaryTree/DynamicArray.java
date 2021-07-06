package com.issac.BinaryTree;

import java.util.Arrays;

public class DynamicArray {
    int rearPointer;
    int[] dynamicArray;

    public DynamicArray(){
        rearPointer = 0;
        dynamicArray = new int[10];
    }

    public boolean isFull(){
        return rearPointer == dynamicArray.length;
    }
    public boolean isEmpty(){
        return rearPointer == 0;
    }
    public void append(int data){
        if(isFull()){
            growArray();
        }
        dynamicArray[rearPointer] = data;
        rearPointer++;
    }
    public void append(DynamicArray data){
        if(isFull()){
            growArray();
        }
        for(int i=0; i<data.getSize(); i++){
            append(data.getAtIndex(i));
        }
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

    public void deleteAtIndex(int index){
        shiftArrayLeft(index);
        rearPointer --;
    }

    private void growArray() {
        int[] tempArray = new int[dynamicArray.length + 10];
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

    private void shiftArrayLeft(int startPos){
        for(int i = startPos + 1; i < dynamicArray.length; i++) {
            dynamicArray[i - 1] = dynamicArray[i];
        }
    }
    public int getSize(){
        return rearPointer;
    }
    @Override
    public String toString() {
        return "DynamicArray{" +
                "rearPointer=" + rearPointer +
                ", dynamicArray=" + Arrays.toString(dynamicArray) +
                '}';
    }
}
