package weekFour;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= m; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
