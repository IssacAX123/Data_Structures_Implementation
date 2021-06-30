package com.issac;

public class StackArray {
    int size;
    int top = -1;
    int[] stack;

    public StackArray(int size){
        stack = new int[size];
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public boolean isEmpty(){
        return top == 0;
    }

    public void push(int data) throws Exception {
        if(!isFull()) {
            stack[top] = data;
        }else{
            throw new Exception("Stack capacity is full");
        }
    }
}
