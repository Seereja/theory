package exceptionTask;

public class exception {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("После вызова метода");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException в методе main()");
        } catch (Exception ex) {
            System.out.println("Exception в методе main()");
        }
        System.out.println("предложение в main");
    }

    static void method() throws Exception {
        try {
//            String s = "abc";
//            System.out.println(s.charAt(3));
            method2();
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException в методе method2()");

        }
        System.out.println("предложение");
    }

    static void method2() throws Exception {
        try {
            String s = "abcd";
            System.out.println(s.charAt(4));
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException в методе method()");

        } finally {
            System.out.println("заключительныеПредложения");
        }
        System.out.println("предложение2");
    }
}
