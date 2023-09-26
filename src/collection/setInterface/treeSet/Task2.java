package collection.setInterface.treeSet;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        Students students1 = new Students("Sergey", 2);
        Students students2 = new Students("Evgen", 3);
        Students students3 = new Students("Alexander", 1);
        Students students4 = new Students("Georgy", 3);
        Students students5 = new Students("Sergey", 5);
        Students students6 = new Students("Evgen", 9);
        Students students7 = new Students("Alexander", 10);
        Students students8 = new Students("Georgy", 11);

        TreeSet<Students> set = new TreeSet<>();

        set.add(students1);
        set.add(students2);
        set.add(students3);
        set.add(students4);
        set.add(students5);
        set.add(students6);
        set.add(students7);
        set.add(students8);

        set.forEach(System.out::println);
        System.out.println();
        System.out.println(set.last());
        System.out.println();
        System.out.println(set.first());
        System.out.println();
        Students students = new Students("Oleg", 5);
        System.out.println(set.headSet(students));
        System.out.println(set.tailSet(students));
        System.out.println(set.subSet(students, students8));
        System.out.println(students2.equals(students4));
        System.out.println(students2.hashCode() == students4.hashCode());
    }
}
