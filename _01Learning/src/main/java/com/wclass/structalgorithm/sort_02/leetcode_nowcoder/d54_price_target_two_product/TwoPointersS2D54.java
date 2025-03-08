package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d54_price_target_two_product;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D54
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-29
 * @Version 1.0
 **/
public class TwoPointersS2D54 {

    public int[] twoSum(int[] price, int target) {
        int i = 0, j = price.length - 1;
        while(i < j) {
            int s = price[i] + price[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { price[i], price[j] };
        }
        return new int[0];
    }

}
