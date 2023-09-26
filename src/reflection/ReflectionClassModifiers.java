package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ReflectionClassModifiers {
    public static void main(String[] args) {
        System.out.println("Модификаторы класса");
        System.out.println(ReflectionClassModifiers.class.getModifiers());
        System.out.println("Класс публичный? " + Modifier.isPublic(ReflectionClassModifiers.class.getModifiers()));
        System.out.println("Класс абстрактный? " + Modifier.isAbstract(ReflectionClassModifiers.class.getModifiers()));
        System.out.println("Класс  isFinal? " + Modifier.isFinal(ReflectionClassModifiers.class.getModifiers()));
        System.out.println("Класс  isPrivate? " + Modifier.isPrivate(ReflectionClassModifiers.class.getModifiers()));

        Class<?> cls = Task.class;
        System.out.println("\n Список всех публичных полей (включая унаследованные) ");
        Arrays.stream(cls.getFields())
                .forEach(field ->
                        System.out.println(
                                "имя поля " + field.getName() + "\tТип поля " + field.getType().getSimpleName()));

        System.out.println("\n Список полей (без унаследованных) ");
        //getDeclaredFields возвращает все поля класса без унаследованных

        Arrays.stream(cls.getDeclaredFields()).forEach(field ->
                System.out.println(
                        "имя поля " + field.getName() + "\tТип поля " + field.getType().getSimpleName()));

        System.out.println();


        try {

            Task task = new Task();
            Field field = Task.class.getField("field");
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.get(task));
            field.set(task, "update");
            System.out.println(field.get(task));
            System.out.println(Modifier.isPublic(field.getModifiers()));
        } catch (
                Exception e) {
            throw new RuntimeException(e);
        }

        printAllFields(cls);

        Task task = new Task();
        task.f = 20;

        try {
            printAllFieldsWithValues(Task.class, task);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printAllFieldsWithValues(Class<?> cls, Task task) throws InstantiationException, IllegalAccessException {

        //создать инстанс и вывести значение его полей
        printAllFields(cls);
        for (Field field : cls.getDeclaredFields()) {
            int mods = field.getModifiers();
            if (Modifier.isPrivate(mods)) {
                field.setAccessible(true);
            }

            System.out.println(field.get(task));
        }
    }


    public static void printAllFields(Class<?> cls) {
        System.out.println("\n Список всех полей (имена + типы) и их модификаторво");
//        Arrays.stream(cls.getDeclaredFields()).forEach(field ->
//                System.out.println(
//                        "имя поля " + field.getName() + "\tТип поля " + field.getType().getSimpleName()
//                                +  "\tМодификатор isPrivate  " + Modifier.isPrivate(field.getModifiers())
//                                + "\tМодификатор isPublic  " + Modifier.isPublic(field.getModifiers())
//                                + "\tМодификатор isProtected   " + Modifier.isProtected(field.getModifiers())));

        for (Field field : cls.getDeclaredFields()) {
            int mods = field.getModifiers();
            //можно через if
            System.out.println(Modifier.toString(mods));
            System.out.println("имя поля " + field.getName() + "\tТип поля " + field.getType().getSimpleName());

        }
        System.out.println();


    }


}


class Task extends TaskExt {
    public String field = "field";
    public static boolean a = false;
    protected Integer f = 1;
    private double g = 1.5;
}


class TaskExt {
    public String j;
    private String e;
}


