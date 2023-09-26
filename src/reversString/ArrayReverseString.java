package reversString;

import java.util.Scanner;

public class ArrayReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String result;
        System.out.println(arrayReverseString(str));
    }

    private static String arrayReverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
}
