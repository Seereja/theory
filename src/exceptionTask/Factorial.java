package exceptionTask;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws FactorialException {


        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        try {
            System.out.println(getFactorial(num));
        } catch (FactorialException e) {
            System.out.println(e.getMessage());

        }

    }

    public static int getFactorial(int num) throws FactorialException {
        int result = 1;
        if (num < 1) throw new FactorialException("The number less then 1 ", num);

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
