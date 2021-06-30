package com.issac;

public class DoubleyLinkedList {
    DoubleyNode head = null;

    public void append(int data){
        if(head == null){
            head = new DoubleyNode(data);
        }else{
            DoubleyNode currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new DoubleyNode(data);
            currentNode.next.prev = currentNode;
        }
    }

    public void prepend(int data){
        DoubleyNode tempNode = new DoubleyNode(data);
        tempNode.next = head;
        head.prev = tempNode;
        head = tempNode;
    }

    public int getValueAt(int index){
        DoubleyNode currentNode = head;
        for(int i=0;i<index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
            head.prev = null;
        } else {
            DoubleyNode currentNode = head;
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            if(currentNode.next != null) {
                currentNode.next.prev = currentNode;
            }
        }
    }

    @Override
    public String toString() {
        String output = "[";
        DoubleyNode currentNode = head;
        boolean loopStopper = true;
        while(loopStopper){
            output += currentNode.data + ", ";
            if(currentNode.next == null){
                loopStopper = false;
            }else{
                currentNode = currentNode.next;
            }
        }
        output = output.substring(0, output.length()-2) + "] [";
        while(currentNode != null){
            output += currentNode.data + ", ";
            currentNode = currentNode.prev;
        }
        output = output.substring(0, output.length()-2) + "]";
        return output;
    }
}
