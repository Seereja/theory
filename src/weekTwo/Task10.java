package weekTwo;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            char c = scanner.next().charAt(0);

            if (c >= 'a' && c <= 'z') {
                System.out.println((char) (c - 32));
//            System.out.println((char) (c + ('A' - 'a')));
            } else
                System.out.println((char) (c + 32));
//            System.out.println((char) (c - ('A' - 'a')));

        }
    }

}