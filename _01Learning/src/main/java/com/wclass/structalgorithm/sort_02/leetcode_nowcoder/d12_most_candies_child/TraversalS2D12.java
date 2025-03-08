package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d12_most_candies_child;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName TraversalS2D12
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-25
 * @Version 1.0
 **/
public class TraversalS2D12 {

    // 拥有最多糖果的孩子
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 获取数组长度
        int n = candies.length;
        // 最大糖果数
        int maxCandies = 0;
        // 枚举得到最大糖果数
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < n; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;
    }

}
