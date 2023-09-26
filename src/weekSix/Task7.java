package weekSix;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] array = getArray(row, column);
        int[] arraySum = sum(array, row, column);
        System.out.println(Arrays.toString(arraySum));
    }

    private static int[][] getArray(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    private static int[] sum(int[][] array, int row, int column) {
        int[] total = new int[column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                total[i] += array[j][i];
            }
        }
        return total;
    }
}
