package week8.task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        linkedList.remove(2);
        linkedList.print();
    }
}
