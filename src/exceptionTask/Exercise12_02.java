package exceptionTask;

import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int result = 0;
        boolean done = false;
        while (!done)
            try {
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
                done = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Некорректный ввод! Введите повторно два целых числа: ");
                scanner.nextLine();
            }
        result = number2 + number1;
        System.out.println(result);

    }
}
