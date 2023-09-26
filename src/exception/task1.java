package exception;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        try {

            firstExample();
            System.out.println("Выполняется");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void firstExample() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
//            System.out.println(delimetr(n, m));
            try {
                System.out.println(toDivide(n, m));
            } catch (MyArithmeticException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private static int toDivide(int n, int m) throws MyArithmeticException {
        int result = 0;
        try {
            result = n / m;
        } catch (ArithmeticException e) {
            throw new MyArithmeticException(e.getMessage());
        }
        System.out.println(123);
        return result;
    }


//    private static int delimetr(int n, int m) {
//        int result = 0;
//        try {
//            result = n / m;
//            System.out.println("Выполняется если ошибки нет");
//            //указываем исключение которое хотим обработать
//        } catch (ArithmeticException e) {
//            //указывает наше исключение и указываем лог
//            throw new MyArithmeticException("Ошибочка " + e.getMessage());
//        } finally {
//            System.out.println("Все равно выполняется");
//        }
//        return result;
//    }
}
