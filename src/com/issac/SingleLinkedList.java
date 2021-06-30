package com.issac;

public class SingleLinkedList {
    SingleNode head = null;

    public void append(int data){
        if(head == null){
            head = new SingleNode(data);
        }else{
            SingleNode currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new SingleNode(data);
        }
    }

    public void prepend(int data){
        SingleNode tempNode = new SingleNode(data);
        tempNode.next = head;
        head = tempNode;
    }

    public int getValueAt(int index){
        SingleNode currentNode = head;
        for(int i=0;i<index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        } else {
            SingleNode currentNode = head;
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    @Override
    public String toString() {
        String output = "[";
        SingleNode currentNode = head;
        while(currentNode != null){
            output += currentNode.data + ", ";
            currentNode = currentNode.next;
        }
        output = output.substring(0, output.length()-2) + "]";
        return output;
    }
}
