package weekFour;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int sum = 0;

        while (m > 0) {
            sum = sum + m % 10;
            System.out.println("sum " + sum);
            m = m / 10;
            System.out.println("m " + m);
        }
        System.out.println("Answer " + sum);
    }
}
