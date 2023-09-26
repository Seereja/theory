package comparable;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//        return anotherEmployee.salary - this.salary;
        int res;
        res = this.name.compareTo(anotherEmployee.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmployee.surname);
        }
        if (res == 0) {
            res = anotherEmployee.salary - this.salary;
        }

        return res;
    }

    static class IdComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            if (employee1.id == employee2.id) {
                return 0;
            }
            if (employee1.id < employee2.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.name.compareTo(employee2.name);
        }
    }

    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee2.salary - employee1.salary;
        }
    }
}
