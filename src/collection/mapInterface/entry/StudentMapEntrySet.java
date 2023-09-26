package collection.mapInterface.entry;

import java.util.HashMap;
import java.util.Map;

public class StudentMapEntrySet {
    public static void main(String[] args) {

        Map<Student, Double> studentDoubleMap = new HashMap<>();
        Student student = new Student(1, "Сергей", 2);
        Student student1 = new Student(1, "Сергей", 2);
        Student student2 = new Student(2, "Yana", 2);
        Student student3 = new Student(3, "Zayr", 2);
        Student student4 = new Student(4, "Alex", 2);

        studentDoubleMap.put(student, 9.2);
        studentDoubleMap.put(student1, 2.2);
        studentDoubleMap.put(student2, 4.2);
        studentDoubleMap.put(student3, 5.2);
        studentDoubleMap.put(student4, 1.2);


        for (Map.Entry<Student, Double> entry : studentDoubleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
