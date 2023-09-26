package weekFour;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Введите число больше нуля");
            n = scanner.nextInt();
            if (n > 0) {
                System.out.println("Отлично");
            }
        } while (n > 0);
    }
}
