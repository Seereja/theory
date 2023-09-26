package leetsCode.arrays;

//Case1 :- All the elements are positive : Then your answer
// will be product of all the elements in the array.
//Case2 :- Array have positive and negative elements both :
//If the number of negative elements is even then again
// your answer will be complete array because on multiplying
// all the negative numbers it will become positive.
//If the number of negative elements is odd then you
// have to remove just one negative element and for that
// u need to check your subarrays to get the max product.
//Case3 :- Array also contains 0 : Then there will be not
// much difference...its just that your array will be divided
// into subarray around that 0. What u have to so is just
// as soon as your product becomes 0 make it 1 for
// the next iteration, now u will be searching
// new subarray and previous max will already be updated.
//*(These cases are much clear in approach 3)

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(maxProduct(array));
    }

    private static int maxProduct(int[] array) {


        int max = array[0];
        int min = array[0];
        int ans = array[0];

        for (int i = 1; i < array.length; i++) {
            // store the max because before updating
            // min your max will already be updated

            int temp = max;

            max = Math.max(Math.max(max * array[i], min * array[i]), array[i]);
            min = Math.min(Math.min(temp * array[i], min * array[i]), array[i]);

            if (max > ans) {
                ans = max;
            }
        }
        return ans;
    }

    private static int maxProduct1(int[] array) {
        int max = array[0], min = array[0], ans = array[0];
        int n = array.length;

        for (int i = 1; i < n; i++) {
            if (array[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(array[i], max * array[i]);
            min = Math.min(array[i], min * array[i]);

            ans = Math.max(ans, max);
        }
        return ans;
    }
}
