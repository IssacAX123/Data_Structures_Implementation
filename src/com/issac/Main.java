package com.issac;

public class Main {

    public static void main(String[] args) throws Exception {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
