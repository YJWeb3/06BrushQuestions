package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d21_buy_sell_stocks;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D21
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-32
 * @Version 1.0
 **/
public class GreedyS14D21 {

    public int maxProfit (int[] prices) {
        //维护最大收益
        int res = 0;
        //排除特殊情况
        if(prices.length == 0)
            return res;
        //维护最低股票价格
        int Min = prices[0];
        //遍历后续股票价格
        for(int i = 1; i < prices.length; i++){
            //如果当日价格更低则更新最低价格
            Min = Math.min(Min, prices[i]);
            //维护最大值
            res = Math.max(res, prices[i] - Min);
        }
        return res;
    }

}
