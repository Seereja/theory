package leetsCode.arrays;

import exception.array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
// nums = [-2,1,-3,4,-1,2,1,-5,4]

        System.out.println(maxSubArray(array));
    }

    private static int maxSubArray(int[] array) {

        int n = array.length;
        int result = 0;
        int maxResult = 0;
        for (int i = 0; i < n; i++) {
            result += array[i];
            if (result < 0) {
                result = 0;
            }
            maxResult = Math.max(result, maxResult);

        }
        return maxResult;
    }
}
