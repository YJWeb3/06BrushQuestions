package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d46_buy_sell_stocks_transaction_fees;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D46
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-19
 * @Version 1.0
 **/
public class GreedyS14D46 {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int buy = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < n; ++i) {
            if (prices[i] + fee < buy) {
                buy = prices[i] + fee;
            } else if (prices[i] > buy) {
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }

}
