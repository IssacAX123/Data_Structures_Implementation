package com.issac.DoubleyLinkedList;

import com.issac.DoubleyLinkedList.DoubleyNode;

public class CircularLinkedList {
    DoubleyNode head = null;

    public void append(int data){
        if(head == null){
            head = new DoubleyNode(data);
        }else if(head.next == null){
            head.next = new DoubleyNode(data);
            head.next.prev = head;
            head.next.next = head;
            head.prev = head.next;
        }
        else{
            DoubleyNode tempNode = new DoubleyNode(data);
            tempNode.next = head;
            tempNode.prev = head.prev;
            head.prev.next = tempNode;
            head.prev = tempNode;

        }
    }

    public void prepend(int data){
        DoubleyNode tempNode = new DoubleyNode(data);
        tempNode.next = head;
        tempNode.prev = head.prev;
        head.prev.next = tempNode;
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
        int i = 0;
        while(loopStopper){
            i +=1;
            output += currentNode.data + ", ";
            if(currentNode.next == null || i==13){
                loopStopper = false;
            }else{
                currentNode = currentNode.next;
            }
        }
        output = output.substring(0, output.length()-2) + "] [";
        if(head.prev != null){
            currentNode = head.prev;
        }else{
            currentNode = head;
        }

        loopStopper = true;
        i = 0;
        while(loopStopper){
            i +=1;
            output += currentNode.data + ", ";
            if(currentNode.prev == null || i==13){
                loopStopper = false;
            }else{
                currentNode = currentNode.prev;
            }
        }
        output = output.substring(0, output.length()-2) + "]";
        return output;
    }
}
