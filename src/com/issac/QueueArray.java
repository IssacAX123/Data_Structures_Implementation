package com.issac;

public class QueueArray {
    int size;
    int rearPointer = 0;
    int[] queue;

    public QueueArray(int size){
        queue = new int[size];
    }
    public boolean isFull(){
        return rearPointer == queue.length;
    }
    public boolean isEmpty(){
        return rearPointer == 0;
    }

    public void enqueue(int data) throws Exception {
        if(!isFull()) {
            queue[rearPointer] = data;
            rearPointer ++;
        }else{
            throw new Exception("Queue capacity is full");
        }
    }
    public int dequeue() throws Exception {
        if(!isEmpty()) {
            rearPointer --;
            int val = queue[0];
            shiftArrayLeft();
            return val;
        }else{
            throw new Exception("Queue is empty");
        }
    }

    private void shiftArrayLeft(){
        for(int i = 1; i < queue.length; i++) {
            queue[i - 1] = queue[i];
        }
    }
}
