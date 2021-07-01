package com.issac;

import com.issac.DoubleyLinkedList.DoubleyLinkedList;

public class QueueLinkedList {
    DoubleyLinkedList stack;

    public QueueLinkedList(){
        stack = new DoubleyLinkedList();
    }
    public boolean isEmpty(){
        return (stack.head.next == null);
    }

    public void enqueue(int data){
        stack.append(data);
    }

    public int dequeue() throws Exception {
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
