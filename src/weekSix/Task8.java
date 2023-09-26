package weekSix;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[] res = new int[column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                res[i] += array[j][i];
            }
        }
        for (int i = 0; i < column; i++) {
            System.out.println(res[i]);
        }
    }
}
