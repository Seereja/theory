package weekTwo;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String a = scanner.nextLine();
            System.out.println((a).replaceAll("[0-9]", ""));
        }
    }
}
