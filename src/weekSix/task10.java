package weekSix;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arrayChas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((Math.floor(i * 0.25) + Math.floor(j * 0.25)) % 2 == 0)
                    arrayChas[i][j] += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayChas[i][j] + " ");

            }
            System.out.println();
        }
    }
}
