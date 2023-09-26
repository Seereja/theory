package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class Task6 {

    public static void main(String[] args) {
        SimpleClass simpleClassObj = new SimpleClass();
        Class<SimpleClass> simpleClass = SimpleClass.class;


        try {
            invokeMethodWithAnnotation(simpleClass, simpleClassObj);
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(simpleClassObj);
    }

    public static void invokeMethodWithAnnotation(Class<?> cls, Object object) throws InvocationTargetException, IllegalAccessException {
        List<Method> methods = List.of(cls.getDeclaredMethods());
        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                if (Modifier.isPrivate(method.getModifiers())) {
                    method.setAccessible(true);
                }
                method.invoke(object);
            }
        }
    }
}
