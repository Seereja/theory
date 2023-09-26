package weekTwo;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 0 && n >= 0) {
            System.out.println("Число четное и больше нуля ");
        }
        if ((n % 2 == 0 && n < 0))
            System.out.println("число четное и меньше нуля");

    }
}
