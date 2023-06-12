package com.company;

public class Main {

    public static void main(String[] args) {

        myLinkedList list = new myLinkedList();

        list.add(546);
        list.add(78);
        list.add(12);
        list.add(846);
        list.add(513);
        list.add(741);
        list.add(520);



        System.out.println("Find node before 12: " + list.findNodeBefore(12) + "\n" +
                "Find number 741 :" + list.find(741) + "\n" + "Find number 5: " + list.find(5) +
                "\n" + "Find node before number 7 : " + list.findNodeBefore(7) + "\n");
        list.delete(546);
        list.delete(846);
        list.delete(513);

        list.traverse();
    }
}
