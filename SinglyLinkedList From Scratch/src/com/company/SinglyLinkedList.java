package com.company;

public class SinglyLinkedList<E> {
    private Node<E> head, tail;
    protected int size;

    public SinglyLinkedList(){
        super();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E data){
        if (data == null){
            throw new NullPointerException("Cannot add null data!!");
        }
        if (!isEmpty()){ // adding subsequent nodes
            Node<E> current = this.tail;
            this.tail = new Node<>(data, null);
            current.nextNode = this.tail;
        }
        else { // adding the first node
            this.tail = new Node<E>(data, null);
            this.head = this.tail;
        }
        size++;
    }

    public boolean remove(E data){
        if (isEmpty()){
            throw new IllegalStateException("Cannot remove() from an empty list!!");
        }

        boolean hasRemoved = false;

        //set both pointer to head to start with
        Node<E> prev = this.head;
        Node<E> curr = this.head;

        //loop until last node is reached or data is found
        while(curr.nextNode != null || curr == this.tail){

            //data is found
            if (curr.data.equals(data)){
                //remove the last remaining node
                if (size == 1) {
                    this.head = null;
                    this.tail = null;
                }
                //remove the first node
                else if (curr.equals(this.head)){
                    this.head = this.head.nextNode;
                }
                //remove the last node
                else if(curr.equals(this.tail)){
                    this.tail = prev;
                    this.tail.nextNode = null;
                }
                //remove the node in the middle
                else{
                    prev.nextNode = curr.nextNode;
                }

                size--;
                hasRemoved = true;
            }
            //move to next node
            prev = curr;
            curr = prev.nextNode;
        }
        return hasRemoved;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
