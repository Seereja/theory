package collection.arrayList.linkedList;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {


        Student2 student1 = new Student2("Коля", 1);
        Student2 student2 = new Student2("Вася", 3);
        Student2 student3 = new Student2("Петя", 4);
        Student2 student4 = new Student2("Жора", 3);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(student1);
        student2LinkedList.add(student2);
        student2LinkedList.add(student3);
        student2LinkedList.add(student4);
        System.out.println("LinkedList " + student2LinkedList);
        System.out.println(student2LinkedList.get(3));
        Student2 student5 = new Student2("Вика", 3);
        Student2 student6 = new Student2("Вагит", 4);
        student2LinkedList.add(student5);
        System.out.println("LinkedList " + student2LinkedList);
        student2LinkedList.add(1, student6);
        System.out.println("LinkedList " + student2LinkedList);


    }
}
