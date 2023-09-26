package weekOne;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        double d;
        d = Math.sqrt(s * (4 / Math.PI));
        System.out.println(d);

        double l = Math.PI * d;
        System.out.println(l);

    }
}
