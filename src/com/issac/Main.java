package com.issac;

public class Main {

    public static void main(String[] args) throws Exception {
        QueueLinkedList stack = new QueueLinkedList();
        stack.enqueue(1);
        System.out.println(stack);
        stack.enqueue(2);
        System.out.println(stack);
        stack.enqueue(3);
        System.out.println(stack);
        stack.dequeue();
        System.out.println(stack);
        stack.dequeue();
        System.out.println(stack);

    }
}
