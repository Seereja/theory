package weekTwo;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean resultOne = isOrPresent(a, b);
        boolean resultTwo = isXOrPresent(a, b);


        System.out.println("ИЛИ " + resultOne);
        System.out.println("Исключающее ИЛИ " + resultTwo);

    }

    private static boolean isXOrPresent(int a, int b) {
//        if (a % 2 != 0 ^ b % 2 != 0) {
//            return true;
//        } else
//            return false;

        boolean aIOdd = a % 2 != 0;
        boolean bIOdd = b % 2 != 0;


        if ((aIOdd && !bIOdd) || (!aIOdd && bIOdd)) {
            return true;
        } else
            return false;
    }

    private static boolean isOrPresent(int a, int b) {
        if (a % 2 != 0 || b % 2 != 0) {
            return true;
        } else
            return false;
    }
}
