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
    public void append(int data){
        if(!isFull()){
            dynamicArray[rear_pointer] = data;
        }
        else{
            growArray();
            dynamicArray[rear_pointer] = data;
        }
        rear_pointer ++;
    }

    private void growArray(){
        int[] tempArray = new int[dynamicArray.length + 4];
        for(int i = 0; i< dynamicArray.length; i++){
            tempArray[i] = dynamicArray[i];
        }
        dynamicArray = tempArray;
        // can use System.arraycopy(dynamicArray, 0, tempArray, 0, dynamicArray.length);
    }
}
