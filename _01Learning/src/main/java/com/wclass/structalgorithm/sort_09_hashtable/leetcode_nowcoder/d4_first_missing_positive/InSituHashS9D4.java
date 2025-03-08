package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d4_first_missing_positive;

/**
 * @program: StructAlgorithm
 * @ClassName InSituHashS9D4
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-08
 * @Version 1.0
 **/
public class InSituHashS9D4 {

    public int minNumberDisappeared (int[] nums) {
        int n = nums.length;
        //遍历数组
        for(int i = 0; i < n; i++)
            //负数全部记为n+1
            if(nums[i] <= 0)
                nums[i] = n + 1;
        for(int i = 0; i < n; i++)
            //对于1-n中的数字
            if(Math.abs(nums[i]) <= n)
                //这个数字的下标标记为负数
                nums[Math.abs(nums[i]) - 1] = -1 * Math.abs(nums[Math.abs(nums[i]) - 1]);
        for(int i = 0; i < n; i++)
            //找到第一个元素不为负数的下标
            if(nums[i] > 0)
                return i + 1;
        return n + 1;
    }

}
