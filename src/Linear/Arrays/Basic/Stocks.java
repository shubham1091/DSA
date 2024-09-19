package Linear.Arrays.Basic;

/**
 * Buy & sell stock
 * you are given an array prices array where price[i] is the price of a given
 * stock
 * on the ith day. You want to maximize your profit by choosing a single day to
 * buy one stock and choosing a different day in future to sell that stock.
 * Return the maximum profit you can achive from this transaction. If you cannot
 * achive any profit, return 0.
 */
public class Stocks {
    public static void main(String[] args) {
        int[] prices = {7,1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }

}
