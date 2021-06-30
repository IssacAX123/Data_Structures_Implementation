package com.issac;

public class QueueStack {
    StackArray stack1;
    StackArray stack2;

    public QueueStack(int size){
        stack1 = new StackArray(size);
        stack2 = new StackArray(size);
    }

    public void enqueue(int data) throws Exception {
        if(!stack1.isFull()){
            stack1.push(data);
        }else{
            throw new Exception("Queue Full");
        }
    }

    public int dequeue() throws Exception {
        if(stack2.isEmpty()){
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }else{
                throw new Exception("Queue Empty");
            }
        }
        return stack2.pop();
    }

    @Override
    public String toString() {
        return "QueueStack{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
