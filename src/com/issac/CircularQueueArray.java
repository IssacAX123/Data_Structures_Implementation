package com.issac;

import java.util.Arrays;

public class CircularQueueArray {
    int size;
    int rearPointer = -1;
    int frontPointer = 0;
    int[] queue;

    public CircularQueueArray(int size){
        queue = new int[size];
    }
    public boolean isFull(){
        return (rearPointer + 1)%queue.length == frontPointer;
    }
    public boolean isEmpty(){
        return rearPointer == frontPointer;
    }

    public void enqueue(int data) throws Exception {
        if(rearPointer == -1){
            rearPointer = (rearPointer + 1) % queue.length;
            queue[rearPointer] = data;
        }
        else {
            if (!isFull()) {
                rearPointer = (rearPointer + 1) % queue.length;
                queue[rearPointer] = data;
            } else {
                throw new Exception("Queue capacity is full");
            }
        }
    }
    public int dequeue() throws Exception {
        if(!isEmpty()) {
            int val = queue[frontPointer];
            frontPointer = (frontPointer + 1) % queue.length;
            return val;
        }else{
            throw new Exception("Queue is empty");
        }
    }


    @Override
    public String toString() {
        return "CircularQueueArray{" +
                "size=" + size +
                ", rearPointer=" + rearPointer +
                ", frontPointer=" + frontPointer +
                ", queue=" + Arrays.toString(queue) +
                '}';
    }
}
