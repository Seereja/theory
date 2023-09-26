package sorted;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {


        int[] arr = new int[]{5, 2, 4, 6, 1, 3, 2, 6};

        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr) {

        int n = arr.length;
        if (n == 1) return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = arr[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = arr[i];

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }


    public static void merge(int[] arr, int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        // отвечает за левую часть
        int i = 0;
        // отвечает за правую часть
        int j = 0;
        int idx = 0;

        while (i < l.length && j < r.length) {
            arr[idx++] = l[i] < r[j] ? l[i++] : r[j++];
        }
        if (i < l.length) {
            System.arraycopy(l, i, arr, idx, l.length - i);
        } else if (j < r.length) {
            System.arraycopy(r, j, arr, idx, r.length - j);
        } 



/*
        while (i < left && j < right) {

            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;
            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < left; ll++)
            arr[idx++] = l[ll];

        for (int rr = j; rr < right; rr++)
            arr[idx++] = r[rr];

*/
    }

}
