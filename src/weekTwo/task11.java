package weekTwo;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String pattern = scanner.nextLine();

        System.out.println(str.replace(pattern, pattern.toUpperCase()));
    }
}
