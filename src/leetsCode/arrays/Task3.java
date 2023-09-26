package leetsCode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.println(duplicateArray(array));
        System.out.println(duplicateArrayHashSet(array));
    }

    private static boolean duplicateArrayHashSet(int[] array) {

        HashSet<Integer> seen = new HashSet<>();
        for (int arrays : array) {
            if (seen.contains(arrays)) {
                return true;
            }
            seen.add(arrays);
        }

        return false;
    }


    private static boolean duplicateArray(int[] array) {
        boolean isDuplicate = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }

        return isDuplicate;
    }
}
