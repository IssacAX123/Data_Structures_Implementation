package com.issac;

public class Main {

    public static void main(String[] args) throws Exception {
        CircularQueueArray stack = new CircularQueueArray(4);
        stack.enqueue(2);
        System.out.println(stack);
        stack.enqueue(3);
        System.out.println(stack);
        stack.enqueue(4);
        System.out.println(stack);
        int data = stack.dequeue();
        System.out.println(data);
        System.out.println(stack);
        data = stack.dequeue();
        System.out.println(data);
        System.out.println(stack);
        stack.enqueue(5);
        System.out.println(stack);
        stack.enqueue(6);
        System.out.println(data);
        System.out.println(stack);
    }
}
