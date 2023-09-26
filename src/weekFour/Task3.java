package weekFour;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int result = 1;
//        for (int i = 0; i < n; i++) {
//            System.out.println((int) Math.pow(m,i));
//        }

//        int i = 1;
//        while (i <= n) {
//            result *= m;
//            System.out.println(result);
//            i++;

        int i = 1;
        do {
            System.out.println(result);
            result *= m;
            i++;
        } while (i <= n);


    }
}
