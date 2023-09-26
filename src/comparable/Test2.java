package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(12, "Sergey", "Shilin", 10000);
        Employee employee2 = new Employee(1, "Sergey", "Shilin", 12000);
        Employee employee3 = new Employee(4, "Yana", "Ganza", 1244300);
        Employee employee4 = new Employee(3, "Yana", "Ganza", 1244400);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println("before sorting \n " + employees);
        System.out.println();
        Collections.sort(employees);
        System.out.println("after sorting  \n" + employees);
        Collections.sort(employees, new Employee.SalaryComparator());
        System.out.println("after sorting SalaryComparator \n" + employees);
        Collections.sort(employees, new Employee.NameComparator());
        System.out.println("after sorting NameComparator \n" + employees);
        Collections.sort(employees, new Employee.IdComparator());
        System.out.println("after sorting IdComparator \n" + employees);

    }
}
