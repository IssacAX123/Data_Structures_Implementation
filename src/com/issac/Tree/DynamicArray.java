package com.issac.Tree;

import java.util.Arrays;

public class DynamicArray {
    int rearPointer;
    Tree[] dynamicArray;

    public DynamicArray(){
        rearPointer = 0;
        dynamicArray = new Tree[4];
    }

    public boolean isFull(){
        return rearPointer == dynamicArray.length;
    }
    public boolean isEmpty(){
        return rearPointer == 0;
    }
    public void append(Tree data){
        if(!isFull()){
            dynamicArray[rearPointer] = data;
        }
        else{
            growArray();
            dynamicArray[rearPointer] = data;
        }
        rearPointer++;
    }
    public void insertAt(int pos, Tree data){
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

    public Tree getAtIndex(int index){
        return dynamicArray[index];
    }

    public void deleteAtIndex(int index){
        shiftArrayLeft(index);
        rearPointer --;
    }

    private void growArray() {
        Tree[] tempArray = new Tree[dynamicArray.length + 4];
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
