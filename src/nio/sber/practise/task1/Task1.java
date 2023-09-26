package nio.sber.practise.task1;

import lambda.Sex;
import lambda.StudentsAgePredicate;
import stream.sorted.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<stream.sorted.Student> students = new ArrayList<>();

        stream.sorted.Student student1 = new stream.sorted.Student("Сергей", lambda.Sex.MALE, 28, 1, 10.0);
        stream.sorted.Student student2 = new stream.sorted.Student("Николай", lambda.Sex.MALE, 27, 1, 9.2);
        stream.sorted.Student student3 = new stream.sorted.Student("Евгений", lambda.Sex.MALE, 32, 2, 7.2);
        stream.sorted.Student student4 = new stream.sorted.Student("Георгий", lambda.Sex.MALE, 31, 2, 8.0);
        stream.sorted.Student student5 = new stream.sorted.Student("Женя", lambda.Sex.FEMALE, 24, 4, 8.1);
        stream.sorted.Student student6 = new stream.sorted.Student("Сара", lambda.Sex.FEMALE, 41, 3, 8.3);
        stream.sorted.Student student7 = new stream.sorted.Student("Александра", lambda.Sex.FEMALE, 31, 2, 8.4);
        stream.sorted.Student student8 = new stream.sorted.Student("Марина", lambda.Sex.FEMALE, 32, 3, 8.1);
        stream.sorted.Student student9 = new Student("Георгий", Sex.MALE, 33, 3, 8.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .forEach(System.out::println);
        System.out.println();

        students.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed()
                        .thenComparing(Student::getAveGrade)
                        .thenComparing(Student::getCourse).reversed()
                        .thenComparing(Student::getName))
                .forEach(System.out::println);

        System.out.println();

        System.out.println(getAverageAge(students));
        System.out.println(maxSizeOfName(students));
        System.out.println(filterOfAgeAndFirstName(students, 'c'));
    }

    public static Double getAverageAge(List<Student> list) {
        return list.stream()
                .mapToInt(Student::getAge)
                .summaryStatistics()
                .getAverage();

    }

    public static Integer maxSizeOfName(List<Student> list) {
        return list.stream()
                .mapToInt(i -> i.getName().length())
                .summaryStatistics().getMax();
    }

    public static List<Student> filterOfAgeAndFirstName(List<Student> students, Character character) {
        return students.stream()
                .filter(student -> (student.getAge() > 30) && (!student.getName()
                        .startsWith(String.valueOf(character)))).toList();
    }
}
