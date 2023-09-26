package testTast;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        int n = 4;
        int[] left = new int[]{1};
        int[] right = new int[]{3};

        System.out.println(getLastMoment(n, left, right));
    }

    public static int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = 0;
        int minRight = Integer.MAX_VALUE;
        for (int l : left) {
            maxLeft = Math.max(l, maxLeft);

        }
        for (int r : right) {
            minRight = Math.min(r, minRight);
        }
        return Math.min(maxLeft, n - minRight);
    }
}

