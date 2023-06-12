package com.company;

public class myLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void add(int num){
        Node node = new Node(num);

        if (head == null){
            head = node;
            tail = node;
        }
        else {
            tail.nextNode = node;
            tail = node;
        }
        size++;

    }

    public Node delete(int num){
        Node node = null;

        //check isEmpty
        if (head == null)
            return  node;

        //delete from front
        if (head.num == num){
            node = head;
            head = head.nextNode;
            size--;
            return node;
        }
        // find item to be delete
        Node current = head;
        Node previous = head;

        while (current != null){
            if (current.num == num){
                break;
            }
            previous = current;
            current = current.nextNode;
        }

        //not found
        if (current == null){
            return node;
        }

        //delete last element
        if (current == tail){
            tail = previous;
        }

        //update node
        node = current;
        previous.nextNode = current.nextNode;
        size--;
        return node;
    }

    public Node findNodeBefore(int num){
        Node current = head;
        Node previous = null;

        while (current != null){
            if (current.num == num){
                break;
            }
            previous = current;
            current = current.nextNode;
        }

        //not
        if (current == null){
            return null;
        }

        return previous;
    }

    public boolean isEmpty(){
        return head == null;
    }

    //find node
    public Node find(int num){
        Node current = head;
        while (current != null){
            if (current.num == num){
                return current;
            }
            current = current.nextNode;
        }
        return current;
    }

    public void traverse(){
        Node current = head;
        System.out.print("HEAD->");
        while (current != null){
            System.out.print(current);
            System.out.print(" ->");
            current = current.nextNode;
        }
        System.out.println("null");

    }


}
