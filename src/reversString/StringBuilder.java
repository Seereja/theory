package reversString;

import java.util.Scanner;

public class StringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        return new java.lang.StringBuilder(str).reverse().toString();
    }



}
