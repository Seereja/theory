package weekOne;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number % 2 == 0)
                System.out.println
                        (number + " четное");
            else if (number % 5 == 0)
                System.out.println
                        (number + " кратно 5");
        }
    }
}
