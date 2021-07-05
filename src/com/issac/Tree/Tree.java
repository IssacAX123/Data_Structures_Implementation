package com.issac.Tree;

public class Tree {
    int data;
    DynamicArray children = new DynamicArray();
    Tree parent = null;
    public Tree(int data){
        this.data = data;
    }
    public void add(Tree node){
        node.parent = this;
        children.append(node);
    }

    public int getDepth(){
        Tree currentNode =this;
        int depth = 0;
        while(currentNode != null){
            currentNode = currentNode.parent;
            depth ++;
        }
        return depth;
    }

    @Override
    public String toString() {
        String str = "";
        if(!children.isEmpty())
            for(int i =0; i < children.getSize(); i++){
                str += children.getAtIndex(i).toString();
            }
        int depth = this.getDepth();
        str += " ".repeat(depth*2) + this.data + "\n";
        return str;
    }
}
