package weekTwo.isPalindrom;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > 999 && a < 10000) {
            int end = a % 10;
            int first = a / 1000;

            if (end != first) {
                System.out.println("Не палиндром");
            } else {
                end = (a % 100) / 10;
                first = (a / 100) % 10;

                if (end != first) {
                    System.out.println("не палиндром");
                } else {
                    System.out.println("палиндром");
                }
            }

        }else
            System.out.println("Вы ввели неверное число");
    }

}