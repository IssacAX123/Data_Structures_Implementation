package com.issac;

import java.util.Arrays;

public class StackArray {
    int size;
    int top = -1;
    int[] stack;

    public StackArray(int size){
        stack = new int[size];
        top ++;
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
            top ++;
        }else{
            throw new Exception("Stack capacity is full");
        }
    }
    public int pop() throws Exception {
        if(!isEmpty()) {
            top --;
            return stack[top];
        }else{
            throw new Exception("Stack is empty");
        }
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "size=" + size +
                ", top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}
