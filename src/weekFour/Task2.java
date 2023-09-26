package weekFour;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = 1;
        for (int i = n; i <= m; i++) {

            result *= i;

        }
        System.out.println(result);
    }
}
