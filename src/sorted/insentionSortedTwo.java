package sorted;

import java.util.Arrays;

public class insentionSortedTwo {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 3, 2, 5, 10, 1, 7};

        Arrays.toString(insertSort(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int[] insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int sort = i - 1;
            while (sort > -1 && arr[sort] > arr[sort + 1]) {
                int temp = arr[sort];
                arr[sort] = arr[sort + 1];
                arr[sort + 1] = temp;
                sort--;
            }
        }
        return arr;
    }

}
