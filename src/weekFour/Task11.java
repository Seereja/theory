package weekFour;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int firstMax = Math.max(firstNumber, secondNumber);
        int secondMax = Math.min(secondNumber, firstMax);

        for (int i = 2; i < n; i++) {

            int k = scanner.nextInt();
            if (k > firstMax) {
                secondMax = k;
                firstMax = k;
            } else if (k > secondMax) {
                secondMax = k;
            }
        }
        System.out.println(firstMax +" "+ secondMax);
    }
}
