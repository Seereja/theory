package leetsCode.arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scanner.nextInt();
        }

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));


    }

    private static int maxProfit2(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(prices[i], buy);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;
    }

    private static int maxProfit(int[] prices) {

        int min_val = prices[0];
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit) {
                max_profit = prices[i] - min_val;
            }

        }
        return max_profit;
    }
}
