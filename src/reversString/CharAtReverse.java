package reversString;

import java.util.Scanner;

public class CharAtReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        System.out.println(charAtReverse(str));
    }

    private static String charAtReverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i)+ result ;
        }
        return result;
    }
}
