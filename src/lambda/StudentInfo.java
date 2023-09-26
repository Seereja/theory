package lambda;

import Modern_Java.chapter_1.Apple;
import Modern_Java.chapter_3.functionInterface.function.Function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> ch) {
        for (Student student : arrayList) {
            if (ch.test(student)) {
                System.out.println(student);
            }
        }

    }


    public static List<Student> filterStudent(List<Student> students, Predicate<Student> p) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (p.test(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public static boolean filterSmartStudent(Student student) {
        return student.getAge() > 25 && student.getAveGrade() > 8.2;
    }

    public static boolean filterOfSillyAndOldAndSexMaleStudent(Student student) {
        return student.getAge() > 30 && student.getAveGrade() < 8.2 && student.sex == Sex.MALE;
    }


    Function<Student, Double> function = student -> student.getAveGrade();


    public static double avgOfSmth(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student elemt : list) {
            result += function.apply(elemt);
        }
        result = result / list.size();
        return result;
    }
//    void printStudentsOverGrade(ArrayList<Student> list, double grade) {
//
//        for (Student student : list) {
//            if (student.aveGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//
//    void printStudentsUnderAge(ArrayList<Student> list, int age) {
//        for (Student student : list) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> list, int age, double grade, Sex sex) {
//
//        for (Student student : list) {
//            if (student.age > age && student.aveGrade > grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }
}
