package week8.task3;

public class MyLinkedList {

    // переменная хед типа Node то есть она содержит
    // в себе значение и ссылку на следующий элемент
    private Node head;

    public class Node {
        //значение
        public int date;
        //ссылка на следующее значениеж
        public Node next;

        public Node(int date) {
            //присваиваем узлу значение
            this.date = date;
            //ссылка на следующее значение равно нулю
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "date=" + date +
                    ", next=" + next +
                    '}';
        }
    }

    // первый метод, который мы реализуем - добавление
    public void add(int date) {
        // создаем объект newNode который будем добавлять в спислк
        Node newNode = new Node(date);
        //Текущая нода будет равнятся голове, поскольку мы добавляем в голову.
        Node currentNode = head;
        if (head == null) {
            //присваиваем голове новый узел
            head = newNode;
        } else {
            //берем текущий узел и его поле с сылкой, пока оно не ссылается на null
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            //присваиваем текущему узлу новый узел, где хранится значение
            currentNode.next = newNode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.date == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    //прерыдущий на следующий после текущего
                    previousNode.next = currentNode.next;
                }
            }


            previousNode = currentNode;
            currentNode = currentNode.next;
        }

    }


    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.date);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.date);
        }
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
