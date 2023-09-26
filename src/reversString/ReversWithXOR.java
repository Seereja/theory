package reversString;

import java.util.Scanner;

public class ReversWithXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(reversWithXOR(str));
    }

    private static String reversWithXOR(String str) {

        char[] arr = str.toCharArray();
        int low = 0;
        int high = str.length() - 1;
        String result = "";

        while (high > low) {
            arr[low] = (char) (arr[low] ^ arr[high]);
            arr[high] = (char) (arr[low] ^ arr[high]);
            arr[low] = (char) (arr[low] ^ arr[high]);
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        return result;
    }
}
