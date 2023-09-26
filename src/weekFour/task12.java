package weekFour;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int firstMax = array[0];
        int secondMax = array[1];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (firstMax < array[i]) {
                secondMax = array[i];
                firstMax = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }


        System.out.println(firstMax + " " + secondMax);
    }
}
