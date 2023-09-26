package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IllegalAccessException {
        SimpleClass obj = new SimpleClass();
        Class<SimpleClass> simpleClass = SimpleClass.class;
        System.out.println( obj);
        setFildDefoultValue(simpleClass, obj);
        System.out.println("после изменений");
        System.out.println(obj);
    }

    private static void setFildDefoultValue(Class<?> simpleClass, Object obj) throws IllegalAccessException {
        for (Field field : getAllFields(simpleClass)) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            if (field.get(obj) == null) {
                if (field.getType() == String.class) {
                    field.set(obj, "default value");
                }
                if (field.getType() == Integer.class) {
                    field.set(obj, 0);
                }
                if (field.getType() == Date.class) {
                    field.set(obj, new Date());
                }
            }


        }


    }

    public static List<Field> getAllFields(Class<?> cls) {
        return List.of(cls.getDeclaredFields());
    }


}
