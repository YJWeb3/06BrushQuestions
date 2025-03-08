package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d36_buy_sell_stock;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D36
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-21
 * @Version 1.0
 **/
public class DynamicProgrammingS14D36 {

    public int bestTiming(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for(int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }

}
