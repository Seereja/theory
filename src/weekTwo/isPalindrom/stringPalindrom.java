package weekTwo.isPalindrom;

import java.util.Scanner;

public class stringPalindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        Boolean result = isPalindrom(str);
        System.out.println(result);
    }

    private static boolean isPalindrom(String str) {

        int length = str.length();
//двигаемся с обоих концов к середине
        for (int i = 0; i < (length / 2); i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
