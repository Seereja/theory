package stream.flatMap;

import lambda.Sex;

import java.util.ArrayList;
import java.util.Comparator;
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


        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied mathematics");


        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);
        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);
        faculty2.addStudentToFaculty(student6);


        List<Faculty> faculties = new ArrayList<>();

        faculties.add(faculty1);
        faculties.add(faculty2);


        faculties.stream()
                .flatMap(faculty -> faculty.getStudentOnFaculty()
                        .stream()
                        .filter(f -> faculty.getName().startsWith("A")))
                .map(Student::getName)
                .forEach(System.out::println);



//        faculties.stream()
//                .flatMap(faculty -> faculty
//                        .getStudentOnFaculty()
//                        .stream()
//                        .filter(student -> student.getAveGrade() > 8.2
//                                && faculty.getName()
//                                .equals("Applied mathematics")))
//                .map(Student::getName)
//                .forEach(System.out::println);


    }
}