package stream.filter;

import Modern_Java.chapter_3.Predicate;
import lambda.Sex;


import java.util.ArrayList;
import java.util.List;


public class Test<T> {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Сергей", Sex.MALE, 28, 1, 10.0);
        Student student2 = new Student("Николай", Sex.MALE, 27, 1, 9.2);
        Student student3 = new Student("Евгений", Sex.MALE, 32, 2, 7.2);
        Student student4 = new Student("Георгий", Sex.MALE, 31, 2, 8.0);
        Student student5 = new Student("Женя", Sex.FEMALE, 24, 4, 8.1);
        Student student6 = new Student("Сара", Sex.FEMALE, 41, 3, 8.3);
        Student student7 = new Student("Александра", Sex.FEMALE, 31, 2, 8.4);
        Student student8 = new Student("Марина", Sex.FEMALE, 32, 3, 8.1);
        Student student9 = new Student("Георгий", Sex.MALE, 33, 3, 8.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);


        //найти студентво у которых оценки больше 8.2
        // найти студентов, которые старше 25 и оценки меньше 8.2
        // найти студентво женщин с оценками больше 8.2
        System.out.println("//найти студентво у которых оценки больше 8.2\n");
        students.stream()
                .filter(student -> student.getAveGrade() > 8.2)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("___________________________________________");
        System.out.println("// найти студентов, которые старше 25 и оценки меньше 8.2");
        students.stream()
                .filter(student -> student.getAveGrade() < 8.2 && student.getAge() > 25)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("___________________________________________");
        System.out.println("// найти студентво женщин с оценками больше 8.2\n");
        students.stream()
                .filter(student -> student.getSex() == Sex.FEMALE && student.getAveGrade() > 8.2)
                .map(Student::getName)
                .forEach(System.out::println);

    }
}