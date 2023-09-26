package weekSix;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            boolean result = degreeBoolean(n);
            System.out.println(result);
        }


    }

    private static boolean degreeBoolean(int n) {

        if (n == 2) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        } else {
            return degreeBoolean(n / 2);
        }


    }
}
