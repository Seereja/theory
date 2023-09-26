package collection.mapInterface.treeMap;



import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {

        TreeMap<Double, Student> studentTreeMap = new TreeMap<>();
        Student student = new Student(1, "Сергей", 2);
        Student student1 = new Student(1, "Сергей", 2);
        Student student2 = new Student(2, "Yana", 2);
        Student student3 = new Student(3, "Zayr", 2);
        Student student4 = new Student(4, "Alex", 2);

        studentTreeMap.put(4.3, student);
        studentTreeMap.put(4.312, student4);
        studentTreeMap.put(6.535, student3);
        studentTreeMap.put(3.123, student2);
        studentTreeMap.put(9.12323, student1);

//        TreeMap<Student, Double> studentTreeMap = new TreeMap<>();
//        Student student = new Student(1, "Сергей", 2);
//        Student student1 = new Student(1, "Сергей", 2);
//        Student student2 = new Student(2, "Yana", 2);
//        Student student3 = new Student(3, "Zayr", 2);
//        Student student4 = new Student(4, "Alex", 2);
//
//
//        studentTreeMap.put(student, 4.3);
//        studentTreeMap.put(student4, 4.312);
//        studentTreeMap.put(student3, 6.535);
//        studentTreeMap.put(student2, 3.123);
//        studentTreeMap.put(student1, 9.12323);


        for (Map.Entry<Double, Student> studentEntry : studentTreeMap.entrySet()) {
            System.out.println(studentEntry.getKey() + ":" + studentEntry.getValue());
        }
//        for (Map.Entry<Student, Double> studentEntry : studentTreeMap.entrySet()) {
//            System.out.println(studentEntry.getKey() + ":" + studentEntry.getValue());
//        }

    }
}
