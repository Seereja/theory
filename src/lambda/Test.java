package lambda;

import Modern_Java.chapter_1.AppleColorPredicate;
import Modern_Java.chapter_3.Predicate;
import Modern_Java.chapter_3.functionInterface.function.Function;

import java.util.ArrayList;
import java.util.Collections;
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


        //первый вариант сортировки

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;
//            }
//        });
//        for (Student s : students) {
//            System.out.println(s);
//        }

//Вариант сортировки с лямда выражением
//        Collections.sort(students, (st1, st2) -> st1.course - st2.course);
//        for (Student st : students) {
//            System.out.println(st);
//        }
//        System.out.println();
//третий вариант
        Collections.sort(students, Comparator.comparing(student -> student.getName()));
        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println();
        StudentInfo info = new StudentInfo();
//        System.out.println("У этих студентво оценка выше 8.2");
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println();
//        System.out.println("______________________________");
//        System.out.println();
//        System.out.println("Эти студенты старше 30");
//        info.testStudents(students, new StudentsAgePredicate());
//        System.out.println();
//        System.out.println("______________________________");
//        System.out.println("Эти студенты мужчины и они старше 30");
//        info.testStudents(students, new StudentSexPredicate());
//        System.out.println("______________________________");
//        System.out.println();
//        System.out.println("Эти студенты c возрастом меньше 30");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });
//        System.out.println("______________________________");
//        System.out.println();
//        //это все заменяет создание интерфейса,замет имплементация его в класс с переопределенным методом.
//        // поскольку нам необходимо каждый раз создавать новый класс и переопределять метод для тех или иных данных
//        info.testStudents(students, (Student s) -> {
//            //тело метода
//            return s.age < 27;
//        });
//        System.out.println("______________________________");
//        System.out.println();
        //можно написать таким образом без типа,класса и return
        System.out.println("У этих студентво оценка выше 8.2");
        info.testStudents(students, s -> s.getAveGrade() > 8.2);
        System.out.println("______________________________");
        System.out.println("У этих студентов возраст больше 25");
        info.testStudents(students, student -> student.getAge() > 25);
        System.out.println("______________________________");
        System.out.println("У этих студентов мужской пол и возраст больше 30");
        info.testStudents(students, student -> student.sex == Sex.MALE && student.getAge() > 30);

        java.util.function.Predicate<Student> p1 = student -> student.getAge() > 25;
        Predicate<Student> p2 = s -> s.getAveGrade() > 8.5;


        List<Student> list = StudentInfo.filterStudent(students, p1);
        List<Student> studentList = StudentInfo.filterStudent(students, StudentInfo::filterSmartStudent);
        System.out.println("______________________________");
        System.out.println(studentList);
        System.out.println();
        List<Student> studentList1 = StudentInfo.filterStudent(students, StudentInfo::filterOfSillyAndOldAndSexMaleStudent);
        System.out.println("______________________________");
        System.out.println(studentList1);
        System.out.println();
        // один раз написанная лямбда может использоваться как параметр в разных методах в дальнейшем
        java.util.function.Predicate<Student> studentPredicate = student -> student.getAveGrade() > 8.6;
        StudentInfo.filterStudent(students, studentPredicate);
//        info.printStudentsOverGrade(students, 8.4);
//        System.out.println();
//        System.out.println("__________________________________________");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println();
//        System.out.println("__________________________________________");
//        info.printStudentsMixCondition(students, 30, 8.2, Sex.FEMALE);


        double result = StudentInfo.avgOfSmth(students, student -> student.getAveGrade());
        System.out.println(result);

        int resultAge = (int) StudentInfo.avgOfSmth(students, student -> (double) student.getAge());
        System.out.println(resultAge);
        

    }
}
