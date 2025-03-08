package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d37_consecutive_days_highest_sales;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D37
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-23
 * @Version 1.0
 **/
public class DynamicProgrammingS14D37 {

    public int maxSales(int[] sales) {
        int pre = 0, maxAns = sales[0];
        for (int x : sales) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
