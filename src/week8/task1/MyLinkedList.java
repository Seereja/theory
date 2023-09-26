package week8.task1;

public class MyLinkedList {

    private int size;
    private Node head;

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        try {
            if (index < 0 || index > size) ;
        } catch (RuntimeException e) {
            throw new RuntimeException("нельзя получить  индекс меньше нуля или больше чем размер листа");
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;

    }


    public void addAtHead(int val) {
        Node newHead = new Node(val, head);
        head = newHead;
        size++;
    }

    public void addAtTail(int val) {
        if (size > 0) {
            Node node = head;
            while (node.next != null) {
//                for (int i = 0; i < size - 1; i++) {
                node = node.next;
            }
            node.next = new Node(val, null);
        } else {
            head = new Node(val, null);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        }
        if (index == size) {
            addAtTail(val);
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node newNode = new Node(val, node.next);
        node.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        try {
            if (index < 0 || index > size) ;
        } catch (RuntimeException e) {
            throw new RuntimeException("нельзя просить индекс меньше нуля или больше чем размер листа");
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        if (index == size - 1) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }
        size--;
    }

    public void print() {
        Node node = head;
        if (head != null) {
            System.out.println(head.value);
        }
        while (node.next != null) {
            node = node.next;
            System.out.println(node.value);
        }


    }
}
