package weekOne;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result1 = b % a;
        int result2 = b / a;

        System.out.println(result1);
        System.out.println(result2);
    }
}
