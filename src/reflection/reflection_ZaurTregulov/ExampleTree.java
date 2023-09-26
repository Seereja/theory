package reflection.reflection_ZaurTregulov;

import java.lang.reflect.Field;

public class ExampleTree {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(1, "Sergey", "Teacher");
        Class<Employee> employeeClass = (Class<Employee>) employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1000000000L);


        System.out.println(employee);

    }
}
