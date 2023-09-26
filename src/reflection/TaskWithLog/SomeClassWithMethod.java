package reflection.TaskWithLog;

import reflection.Logger;

public class SomeClassWithMethod {
    @ToBeLogged
    public void foo(int a) {
        System.out.println("foo " + a);
    }

    @ToBeLogged(logLevel = Logger.DEBUG)
    public void bar(int a) {
        System.out.println("bar " + a);
    }

    @ToBeLogged(logLevel = Logger.INFO)
    public void baz(int a) {
        System.out.println("baz " + a);
    }

}
