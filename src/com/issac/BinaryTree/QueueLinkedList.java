package com.issac.BinaryTree;

public class QueueLinkedList {
    DoubleyLinkedList queue;

    public QueueLinkedList(){
        queue = new DoubleyLinkedList();
    }
    public boolean isEmpty(){
        return (queue.head.next == null);
    }

    public void enqueue(BinarySearchTree data){
        queue.append(data);
    }

    public BinarySearchTree dequeue() throws Exception {
        if(!isEmpty()) {
            BinarySearchTree value =  queue.getValueAt(0);
            queue.deleteAt(0);
            return value;
        }else{
            throw new Exception("queue is empty");
        }
    }

    public int getSize(){
        return queue.getSize();
    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                ", stack=" + queue.toString() +
                '}';
    }
}
