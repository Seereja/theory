package reflection.menu;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


        Class<Dish> dishClass = Dish.class;


    }

    public static List<String> firstExample(Class<?> cls) {
        List<String> privatList = new ArrayList<>();
        List<Field> fieldList = new ArrayList<>();
        List<Method> methodList = new ArrayList<>();

        privatList.addAll(getAllPrivateFields(cls).stream().map(Field::getName).toList());
        privatList.addAll(getAllPrivateMethods(cls).stream().map(Method::getName).toList());

        return privatList;

    }


    public static List<Field> getAllPrivateFields(Class<?> cls) {
        List<Field> fieldList = new ArrayList<>();
        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                fieldList.add(field);
            }
        }

        return fieldList;
    }

    public static List<Method> getAllPrivateMethods(Class<?> cls) {
        List<Method> methodList = new ArrayList<>();
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPrivate(method.getModifiers())) {
                methodList.add(method);
            }
        }

        return methodList;
    }
}