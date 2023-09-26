package reflection.reflection_ZaurTregulov;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ExampleOne {


    public static void main(String[] args)
            throws ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException {

        // 1 вараинт

        Class employeeClass = Class.forName("reflection.reflection_ZaurTregulov.Employee");
        System.out.println(employeeClass);

        Field someField = employeeClass.getField("id");
        System.out.println("Получение типа");

        System.out.println("getType() " + someField.getType());
        System.out.println("__________________________________");
        System.out.println("Получение типа и имя поля без приватных");

        //получаем массив полей
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            //тип поля + имя поля
            System.out.println("getType() " + field.getType() + "getName() " + field.getName());
        }
        System.out.println("__________________________________");
        System.out.println("Получение всех типов и имен полей, даже приватных");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            //тип поля + имя поля
            System.out.println("getType() " + field.getType() + "getName() " + field.getName());
        }
        System.out.println("__________________________________");
        System.out.println("Получение информации о методе");
        //возвращает объект класса метод
        Method method1 = employeeClass.getMethod("increaseSalary");
        System.out.println("getReturnType() " + method1.getReturnType()
                + " getParameterTypes() " + Arrays.toString(method1.getParameterTypes()));

        System.out.println();
        System.out.println("Получение информации о методе c параметром о поле? double.class");
        Method method2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("getReturnType() " + method2.getReturnType()
                + " getParameterTypes() " + Arrays.toString(method2.getParameterTypes()));

        System.out.println();
        System.out.println("Получение информации о методах : имя, тип, типа параметра ( без приватных)");

        Method[] methods = employeeClass.getMethods();
        for (Method allMethodsWithoutPrivateMethods : methods) {
            System.out.println("getName() " + allMethodsWithoutPrivateMethods.getName()
                    + "| getReturnType() " + allMethodsWithoutPrivateMethods.getReturnType()
                    + "| getParameterTypes() "
                    + Arrays.toString(allMethodsWithoutPrivateMethods.getParameterTypes()));
        }


        System.out.println();
        System.out.println("Получение информации о методах : имя, тип, типа параметра (с приватными)");
        Method[] methods2 = employeeClass.getDeclaredMethods();
        for (Method allMethods : methods2) {
            System.out.println("getName() " + allMethods.getName()
                    + "| getReturnType() " + allMethods.getReturnType()
                    + "| getParameterTypes() " + Arrays.toString(allMethods.getParameterTypes()));
        }

        System.out.println();
        System.out.println("Получение информации о публичных методах ");
        Method[] methods3 = employeeClass.getDeclaredMethods();
        for (Method method3 : methods3) {
            if (Modifier.isPublic(method3.getModifiers())) {
                System.out.println("getName() " + method3.getName()
                        + "| getReturnType() " + method3.getReturnType()
                        + "| getParameterTypes() " + Arrays.toString(method3.getParameterTypes()));
            }
        }

        System.out.println("__________________________________");
        System.out.println();
        System.out.println("Получение информации о конструкторе ");
        System.out.println();
        System.out.println("Получение информации о конструкторе количество параметров и тип ");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("getParameterCount() " + constructor1.getParameterCount() +
                " parameters " + " " + " type " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println();
        System.out.println("Получение информации о конструкторе количество параметров и тип ");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("getParameterCount() " + constructor2.getParameterCount() +
                " parameters " + " " + " type " + Arrays.toString(constructor2.getParameterTypes()));


        System.out.println();
        System.out.println("Получение информации о конструкторах количество параметров и тип ");
        Constructor[] constructors3 = employeeClass.getConstructors();
        for (Constructor constructor : constructors3) {
            System.out.println("getName() " + constructor.getName() + "getParameterCount() " + constructor.getParameterCount() +
                    " parameters " + " " + " type " + Arrays.toString(constructor.getParameterTypes()));
        }

        //        //2 вариант
        //
        //        Class employeeClass2 = Employee.class;
        //        System.out.println(employeeClass2);
        //
        //        //3 вариант
        //
        //        Employee employee = new Employee();
        //        Class employeeClass3 = employee.getClass();
        //        System.out.println(employeeClass3);


    }
}
