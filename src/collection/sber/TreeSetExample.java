package collection.sber;

import collection.sber.person.PerconeComparator;
import collection.sber.person.Person;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(new PerconeComparator());
        people.add(new Person("Sergey", 31));
        people.add(new Person("Alex", 12));
        people.add(new Person("Gena", 14));
        people.add(new Person("Zhora", 33));

        people.forEach(System.out::println);
    }
}
