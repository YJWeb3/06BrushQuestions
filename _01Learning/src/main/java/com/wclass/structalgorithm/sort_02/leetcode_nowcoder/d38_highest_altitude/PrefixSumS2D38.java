package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d38_highest_altitude;

/**
 * @program: StructAlgorithm
 * @ClassName PrefixSumS2D38
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-20
 * @Version 1.0
 **/
public class PrefixSumS2D38 {

    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int x : gain) {
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;
    }

}
