package reversString;

import java.util.Scanner;

public class ReverseStringOfRecursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        reverseStringOfRecursion(str);
    }

    private static String reverseStringOfRecursion(String str) {

        int length = str.length();

        if (length <= 1) {
            return str;
        }
        String leftStr = (str.substring(0, length / 2));
        String rightStr = (str.substring(length / 2, length));

        return reverseStringOfRecursion(rightStr) + reverseStringOfRecursion(leftStr);
    }
}
