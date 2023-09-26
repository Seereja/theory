package reflection.reflection_ZaurTregulov;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ExampleTwo {
    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {
        Class<Employee> employeeClass = Employee.class;


        Constructor<Employee> constructor = employeeClass.getConstructor();

        Employee o = constructor.newInstance();
        System.out.println(o);
        // Employee o1 = constructor.newInstance();
        // так написать не можем, потому что  newInstance() возвращает object
        // Constructor<Employee> constructor = employeeClass.getConstructor();
        // если используем generic, то ок


//        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
//        Object o1 = constructor1.newInstance(5, "Sergey", "Teacher");
//        System.out.println(o1);
//
//        Method method = employeeClass.getMethod("setSalary", double.class);
//        method.invoke(o1, 800.130);


        showAllMethods(employeeClass);
    }

    public static void showAllMethods(Class<?> cls) {
//        Method[] methods = cls.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("getName() " + method.getName()
//                    + "| getReturnType() " + method.getReturnType()
//                    + "| getParameterTypes() " + Arrays.toString(method.getParameterTypes()));
//        }

        Arrays.stream(cls.getMethods())
                .forEach(i -> System.out.println("getName() " + i.getName() + " " +
                        "| getReturnType() " + i.getReturnType() + " " +
                        "| getDeclaringClass().getName() " + i.getDeclaringClass().getName() + " " +
                        "| getParameterTypes() " + Arrays.toString(i.getParameterTypes())));
    }
}

