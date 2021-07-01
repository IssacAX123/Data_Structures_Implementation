package com.issac;

import java.util.Arrays;

public class StackLinkedList {
    DoubleyLinkedList stack;

    public StackLinkedList(){
        stack = new DoubleyLinkedList();
    }
    public boolean isEmpty(){
        return (stack.head.next == null);
    }

    public void push(int data){
        stack.prepend(data);
    }

    public int pop() throws Exception {
        if(!isEmpty()) {
            int value =  stack.getValueAt(0);
            stack.deleteAt(0);
            return value;
        }else{
            throw new Exception("Stack is empty");
        }
    }

    public int getSize(){
        return stack.getSize();
    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                ", stack=" + stack.toString() +
                '}';
    }
}
