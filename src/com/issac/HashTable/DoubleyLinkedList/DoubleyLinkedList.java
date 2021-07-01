package com.issac.HashTable.DoubleyLinkedList;

public class DoubleyLinkedList {
    int size = 0;
    public DoubleyNode head = new DoubleyNode("sentinal",0);

    public void append(String key, int data){
        DoubleyNode currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new DoubleyNode(key, data);
        currentNode.next.prev = currentNode;
        size += 1;
    }

    public void prepend(String key, int data){
        DoubleyNode tempNode = new DoubleyNode(key, data);
        tempNode.next = head.next;
        if(head.next == null){
            append(key, data);
        }
        head.next.prev = tempNode;
        head.next = tempNode;
        size += 1;
    }

    public int getValueAt(int index){
        DoubleyNode currentNode = head.next;
        for(int i=0;i<index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void deleteAt(int index){
        if(index == 0){
            head.next.prev = null;
            head.next = head.next.next;
            head.next.prev = head;
        } else {
            DoubleyNode currentNode = head.next;
            for (int i = 0; i < index-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            if(currentNode.next != null) {
                currentNode.next.prev = currentNode;
            }
        }
        size -= 1;
    }

    public java.lang.Integer find(String key) {
        DoubleyNode currentNode = head.next;
        boolean loopStopper = true;
        while(loopStopper){
            if(currentNode.next == null){
                loopStopper = false;
                return null;
            }else if(currentNode.key.equals(key)){
                loopStopper = false;
            }else{
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        String output = "[";
        DoubleyNode currentNode = head.next;
        boolean loopStopper = true;
        while(loopStopper){
            output += "{"+currentNode.key + ": " + currentNode.data + "}, ";
            if(currentNode.next == null){
                loopStopper = false;
            }else{
                currentNode = currentNode.next;
            }
        }
        output = output.substring(0, output.length()-2) + "]";
        return output;
    }
}
