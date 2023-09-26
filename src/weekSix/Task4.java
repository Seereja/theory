package weekSix;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(revers(str));
    }

    private static String revers(String str) {
        if (str.isEmpty()) {
            return str;
        } else {

            return revers(str.substring(1)) + str.charAt(0);
        }
    }
}