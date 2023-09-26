package weekFour;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

        double start = 1000;
        double limit = 1100;

        int count = 1;
        while (start < limit) {
            start += start * p / 100;
            count++;
        }
        System.out.println(count);
        System.out.println(start);
    }
}
