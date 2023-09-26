package nio.programer1;

import java.io.Serializable;

public class Employees implements Serializable {

    final static int serialVersionUID = 1;

    String name;
    String surname;
    String department;
    //    int age;
    transient double salary;
    Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Employees(String name,String surname, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ",car=" + car +
                '}';
    }
}
