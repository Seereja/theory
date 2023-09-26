package weekSix;

import java.util.Random;
import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//ряды
        int m = scanner.nextInt();// места

        Random random = new Random();

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2);
            }
        }

        boolean result = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                if ((a[i][j] == 0 && a[i][j + 1] == 0)) {
                    result = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println(result);


    }
}
