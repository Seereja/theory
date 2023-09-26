package reflection.TaskWithLog;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LoggingService {

    public static void log(Class<?> cls, String methodName) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(methodName)) {
                if (method.isAnnotationPresent(ToBeLogged.class)) {
                    ToBeLogged toBeLogged = method.getAnnotation(ToBeLogged.class);
                    switch (toBeLogged.logLevel()) {
                        case INFO -> System.out.println("INFO logging method: "+method.getName()+" at time "+ LocalDateTime.now());
                        case DEBUG -> System.out.println("DEBUG logging method: "+method.getName()+" at time "+ LocalDateTime.now());
                    }
                }
            }
        }
    }
}
