package reflection;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        Class<SimpleClass> simpleClassClass = SimpleClass.class;
        Class<SecondSimpleClass> secondSimpleClassClass = SecondSimpleClass.class;

        compareFields(simpleClassClass, secondSimpleClassClass);
    }

    public static void compareFields(Class<?> firstClass, Class<?> secondClass) {

//        Set<String> firstClassFields = new HashSet<>();
//        for (Field field : firstClass.getDeclaredFields()) {
//            firstClassFields.add(field.getName());
//        }

        Set<String>firstClassFieldsStream=Arrays
                .stream(firstClass.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toSet());
        Set<String>secondClassFieldsStream=Arrays
                .stream(secondClass.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toSet());
//        Set<String> secondClassFields = new HashSet<>();
//        for (Field field : secondClass.getDeclaredFields()) {
//            secondClassFields.add(field.getName());
//        }

        Set<String> maxFieldSet = firstClassFieldsStream;
        Set<String> minFieldSet = secondClassFieldsStream;

        if (secondClass.getDeclaredMethods().length > maxFieldSet.size()) {
            maxFieldSet = secondClassFieldsStream;
            minFieldSet = firstClassFieldsStream;
        }
        int countFields = maxFieldSet.size();
        maxFieldSet.removeAll(minFieldSet);
        if (maxFieldSet.size() < countFields / 2) {
            System.out.println("Классы содержат много схожих полей");
        }

    }
}
