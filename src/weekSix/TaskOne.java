package weekSix;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int j) {
        if (j == 0) {
            return 1;
        } else {
            return j * factorial(j - 1);
        }
    }
}