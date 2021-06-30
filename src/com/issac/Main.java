package com.issac;

public class Main {

    public static void main(String[] args) throws Exception {
        StackArray stack = new StackArray(4);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int data = stack.pop();
        System.out.println(data);
        System.out.println(stack);
    }
}
