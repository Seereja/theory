package week8.task1;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(4);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);

        myLinkedList.print();

    }
}
