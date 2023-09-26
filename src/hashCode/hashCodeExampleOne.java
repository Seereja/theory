package hashCode;

import java.util.HashMap;
import java.util.Map;

public class hashCodeExampleOne {
    public static void main(String[] args) {

        Map<Student, Integer> studentIntegerMap = new HashMap<>();

        Student student = new Student(1, "Сергей", 2);
        Student student1 = new Student(1, "Сергей", 2);
        Student student2 = new Student(2, "Yana", 2);
        Student student3 = new Student(3, "Zayr", 2);
        Student student4 = new Student(4, "Alex", 2);

        studentIntegerMap.put(student, 10);
        studentIntegerMap.put(student2, 4);
        studentIntegerMap.put(student3, 5);
        studentIntegerMap.put(student4, 8);

//        boolean result = studentIntegerMap.containsKey(student1);
//        System.out.println(result);
//        System.out.println(studentIntegerMap);

        System.out.println(student1.hashCode());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());


    }
}
