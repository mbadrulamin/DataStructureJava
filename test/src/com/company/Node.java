package com.company;

public class Node {
    int num;
    Node nextNode;

    public Node(){
        //default constructor
    }

    public Node(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return " " + num ;
    }
}
