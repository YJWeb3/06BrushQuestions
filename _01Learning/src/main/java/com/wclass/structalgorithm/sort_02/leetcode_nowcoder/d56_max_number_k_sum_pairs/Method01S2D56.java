package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d56_max_number_k_sum_pairs;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName Method01S2D56
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-37
 * @Version 1.0
 **/
public class Method01S2D56 {

    public int maxOperations(int[] nums, int k) {
        // max 表示可以对数组执行的最大操作数
        int max = 0;
        int len = nums.length;
        // 升序排序
        Arrays.sort(nums);
        int i = 0,j = len - 1;
        while(i < j){
            // 依次处理3种情况
            if(nums[i] + nums[j] == k){
                max++;
                i++;
                j--;
            }else if(nums[i] + nums[j] > k){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }

}
