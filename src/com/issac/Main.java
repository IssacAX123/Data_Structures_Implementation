package com.issac;

public class Main {

    public static void main(String[] args) throws Exception {
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.append(1);
        System.out.println(linkedList);
        linkedList.append(2);
        System.out.println(linkedList);
        linkedList.append(3);
        System.out.println(linkedList);
        linkedList.prepend(4);
        System.out.println(linkedList);
        linkedList.deleteAt(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getValueAt(2));
        linkedList.deleteAt(1);
        System.out.println(linkedList);

    }
}
