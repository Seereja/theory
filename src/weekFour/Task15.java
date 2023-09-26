package weekFour;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int decimalNumber = 0;
        int i = 0;

        while (n != 0) {

            int r = n % 10;
            n = n / 10;

            decimalNumber = (int) (decimalNumber + r * Math.pow(2, i));
            i++;
        }
        System.out.println(decimalNumber);
    }
}
