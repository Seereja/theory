package collection.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "Sergey", "Shilin", 10000);
        Employee employee2 = new Employee(2, "Sergey", "Shilin", 12000);
        Employee employee3 = new Employee(1, "Yana", "Ganza", 1244300);
        Employee employee4 = new Employee(4, "Yana", "Ganza", 1244400);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }
}
