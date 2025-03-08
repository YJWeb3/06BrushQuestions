package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d22_buy_sell_stocks;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D22
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-33
 * @Version 1.0
 **/
public class GreedyS14D22 {

    public int maxProfit (int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            //只要某段在递增就有收益
            if(prices[i - 1] < prices[i])
                //收益累加
                res += prices[i] - prices[i - 1];
        }
        return res;
    }

}
