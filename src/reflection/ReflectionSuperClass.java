package reflection;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ReflectionSuperClass {

    interface A {
    }

    interface B {
    }

    interface J {
    }

    class C
            implements A {
    }

    class D
            extends C
            implements B, J {
    }

    public static void main(String[] args) {
        //получение класса Родителя
        System.out.println("Класс родитель класса D->" + D.class.getSuperclass().getSimpleName());
        System.out.println("список всех интерефейсов класса D->");
        //получаем интерефесы, которые напрямую указаны в классе -> не идет вверх по иерархии
        for (Class<?> cls : D.class.getInterfaces()) {
            System.out.println("\t" + cls.getSimpleName());
        }

        List<Class<?>> classList = getAllInterfaces(D.class);
        for (Class<?> listInterfaces : classList) {
            System.out.println(listInterfaces.getSimpleName());
        }
    }


    //вернуть все интерфейсы не включая интерфейсы родительского класса
    private static List<Class<?>> getAllInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();
        while (cls != Object.class) {
            interfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }

        return interfaces;
    }

}
