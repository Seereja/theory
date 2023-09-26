package leetsCode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskForRoma {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        reverse(array);
        reverse1(array);

    }

    private static void reverse(int[] array) {
        int n = array.length - 1;
        int nums[] = new int[array.length];
        for (int i = n, j = 0; n >= j; i--, j++) {
            nums[j] = array[i];
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nums));

    }

    private static void reverse1(int[] array) {
        int n = array.length / 2;
        for (int i = 0; i < n; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }


    }


}
