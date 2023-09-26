package leetsCode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(findMin(array));
    }

    private static int findMin(int[] array) {


        int low = 0;
        int hight = array.length - 1;


        while (low < hight) {
            int mid = (hight + low) / 2;
            if (array[mid] < array[hight]) {
                hight = mid;
            } else
                low = mid + 1;
        }
        return array[low];
    }

}

