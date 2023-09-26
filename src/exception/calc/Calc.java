package exception.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    private static final Scanner scanner = new Scanner(System.in);

    private static int a;
    private static int b;
    private static char c;


    private static void input() {
        try {
            a = scanner.nextInt();
            c = scanner.next().charAt(0);
            b = scanner.nextInt();
        } catch (RuntimeException e) {
            throw new MyInputException();
        }

    }

    public static int calculate() {

        return switch (c) {
            case '+' -> sum();
            case '-' -> sub();
            case '/' -> integerDiv();
            case '*' -> mul();
            default -> throw new MyWrongOperatorException();
        };
    }

    private static int sum() {
        try {
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverFlowException();
        }
    }

    private static int sub() {
        try {
            return Math.subtractExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverFlowException();
        }
    }

    private static int integerDiv() {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new MyDivisionZeroException();
        }
    }

    private static int mul() {
        try {
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            throw new MyIntOverFlowException();
        }
    }

    public static void main(String[] args) {
        input();
        int res = calculate();
        System.out.println(res);

    }
}
