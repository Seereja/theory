package stream.collectors;

import lambda.Sex;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Сергей", Student.Sex.MALE, 28, 1, 10.0);
        Student student2 = new Student("Николай", Student.Sex.MALE, 27, 1, 9.2);
        Student student3 = new Student("Евгений", Student.Sex.MALE, 32, 2, 7.2);
        Student student4 = new Student("Георгий", Student.Sex.MALE, 31, 2, 8.0);
        Student student5 = new Student("Женя", Student.Sex.FEMALE, 24, 4, 8.1);
        Student student6 = new Student("Сара", Student.Sex.FEMALE, 41, 3, 8.3);
        Student student7 = new Student("Александра", Student.Sex.FEMALE, 31, 2, 8.4);
        Student student8 = new Student("Марина", Student.Sex.FEMALE, 32, 3, 8.1);
        Student student9 = new Student("Георгий", Student.Sex.MALE, 33, 3, 8.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);


        Map<Boolean, List<Student>> mapBoolean = students
                .stream()
                .collect(Collectors.partitioningBy(s -> s.getAveGrade() > 8.2));

        for (Map.Entry<Boolean, List<Student>> entry1 : mapBoolean.entrySet()) {
            System.out.println(entry1.getKey() + ": " + entry1.getValue());
        }

        System.out.println();
        Map<Integer, List<Student>> map = students.stream().map(s -> {
                    s.setName(s.getName().toUpperCase());
                    return s;
                })
                .collect(Collectors.groupingBy(Student::getCourse));


        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        //реализация таблицы 6.1 из книги Современная Java
        System.out.println("Collectors.toList()");
        List<Student> st = students.stream().collect(Collectors.toList());
        System.out.println(st);
        System.out.println("Collectors.toSet()");
        Set<Student> st1 = students.stream().collect(Collectors.toSet());
        System.out.println(st1);
        System.out.println("Collectors.toCollection(ArrayList::new");
        Collection<Student> st2 = students.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(st2);

        long howSumStudent = students.stream().collect(counting());
        System.out.println("collect(counting()) " + "студентов всего  " + howSumStudent);
//тупо
        int totalAgeOfStudent = students.stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println("collect(Collectors.summingInt(Student::getAge) " + " всего лет сутдентам " + totalAgeOfStudent);

        double avgGradeOfAllStudents = students.stream().collect(averagingDouble(Student::getAveGrade));
        System.out.println("collect(averagingDouble(Student::getAveGrade) " + "средняя оценка студентов " + avgGradeOfAllStudents);

        DoubleSummaryStatistics summaryStatistics = students.stream().collect(summarizingDouble(Student::getAveGrade));
        System.out.println("collect(summarizingInt(Student::getAveGrade))" + " вся статистика по getAveGrade " + summaryStatistics);

        String AllNameOfStudent = students.stream().map(Student::getName).collect(Collectors.joining(", "));
        System.out.println("map(Student::getName).collect(Collectors.joining(, ) " + "конкотенация имен: " + AllNameOfStudent);

        Optional<Student> theSmartestStudent = students.stream()
                .collect(maxBy(Comparator.comparingDouble(Student::getAveGrade)));
        System.out.println("collect(maxBy(Comparator.comparingDouble(Student::getAveGrade)) " + "самый умный студент " + theSmartestStudent);


        int TotalAgeOfStudent = students.stream()
                .collect(reducing(0, Student::getAge, Integer::sum));
        System.out.println("collect(reducing(0, Student::getAge, Integer::sum)) " + "TotalAgeOfStudent " + TotalAgeOfStudent);

        int howManyStudents = students.stream().collect(collectingAndThen(toList(), List::size));
        System.out.println("collect(collectingAndThen(toList(), List::size) " + "howManyStudents  " + howManyStudents);

        Map<Student.Sex, List<Student>> sexListMap = students.stream().collect(groupingBy(Student::getSex));

        for (Map.Entry<Student.Sex, List<Student>> entry : sexListMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<Integer, List<Student>> integerListMap = students.stream().collect(groupingBy(Student::getCourse));

        for (Map.Entry<Integer, List<Student>> entry : integerListMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}