package weekTwo.isPalindrom;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Sample input: ");
            String input = scanner.nextLine();
            System.out.print("Sample output: ");
            System.out.print(isPalindrome(input));
        } catch (Exception e) {
            System.out.println("Input error");
            ;
        }

    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else
            return isPalindrome(s.substring(1, s.length() - 1));

        }

}
