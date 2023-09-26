package weekSix;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int p = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == p) {
                    int iIndex = i;
                    int jIndex = j;

                    for (int k = 0; k < n; k++) {
                        if (array[k][jIndex] != p) {
                            array[k][jIndex] = 0;
                        }
                        if (array[iIndex][k] != p) {
                            array[iIndex][k] = 0;
                        }
                    }
                }
            }
        }


        printArray(n, array);
    }

    private static void printArray(int n, int[][] array) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");

            }
        }
    }
}