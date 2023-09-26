package reflection.TaskWithLog;

import reflection.TaskWithLog.LoggingService;
import reflection.TaskWithLog.SomeClassWithMethod;

public class TestSomeClassWithMethods {
    public static void main(String[] args) {
        SomeClassWithMethod someClassWithMethod = new SomeClassWithMethod();
        LoggingService.log(SomeClassWithMethod.class, "foo");
        someClassWithMethod.foo(1);
        LoggingService.log(SomeClassWithMethod.class, "bar");
        someClassWithMethod.bar(1);
        LoggingService.log(SomeClassWithMethod.class, "baz");
        someClassWithMethod.baz(1);

    }
}
