package com.company;

public class Node<E>{

    E data;
    Node<E> nextNode;

    public Node(E data, Node<E> nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", nextNode=" + nextNode + '}';
    }
}
