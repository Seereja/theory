package exceptionTask.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.println("Введите число от 1 до 12");

            try {
                int numberOfMonth = scanner.nextInt();
                System.out.println("Месяц " + months[numberOfMonth - 1]);
                System.out.println("Количество дней " + dom[numberOfMonth - 1]);

            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Недопустимое число");
                scanner.nextLine();
            }
        }
    }
}
