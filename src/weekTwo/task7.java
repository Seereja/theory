package weekTwo;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean one = (a == -b && a != 0);
        boolean two = (b == -c && b != 0);
        boolean three = (c == -a && c != 0);

        if (one || two || three) {
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
