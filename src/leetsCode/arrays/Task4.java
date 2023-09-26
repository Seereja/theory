package leetsCode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.println(Arrays.toString(productExceptSelf(array)));
        System.out.println(Arrays.toString(productExceptSelf1(array)));

    }

    private static int[] productExceptSelf1(int[] array) {
        int n = array.length;
        int[] arr = new int[n];
        int pro = 1;
        for (int i : array) {
            pro *= i;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = pro / array[i];
        }
        return arr;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                pro *= nums[j];
            }
            array[i] = pro;
        }


        return array;
    }
}
