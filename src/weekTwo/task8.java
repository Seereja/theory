package weekTwo;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int sum;
            if (a >= b && c >= b) {
                sum = a + c;
            } else if (b >= a && c >= a) {
                sum = b + c;
            } else {
                sum = a + b;
            }
            System.out.println(sum);
            System.out.println(Math.max(Math.max(a + b, b + c), a + c));
        }

    }
}


