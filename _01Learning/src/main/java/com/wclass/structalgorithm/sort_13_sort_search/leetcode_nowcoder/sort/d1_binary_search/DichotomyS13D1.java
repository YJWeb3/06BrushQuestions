package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d1_binary_search;

/**
 * @program: StructAlgorithm
 * @ClassName DichotomyS13D1
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-16
 * @Version 1.0
 **/
public class DichotomyS13D1 {

    public int search (int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        //从数组首尾开始，直到二者相遇
        while(l <= r){
            //每次检查中点的值
            int m = (l + r) / 2;
            if(nums[m] == target)
                return m;
            //进入左的区间
            if(nums[m] > target)
                r = m - 1;
                //进入右区间
            else
                l = m + 1;
        }
        //未找到
        return -1;
    }

}
