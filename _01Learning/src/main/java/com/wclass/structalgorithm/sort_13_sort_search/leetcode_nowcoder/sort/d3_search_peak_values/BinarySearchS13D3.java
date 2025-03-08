package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d3_search_peak_values;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D3
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-18
 * @Version 1.0
 **/
public class BinarySearchS13D3 {

    public int findPeakElement (int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //二分法
        while(left < right){
            int mid = (left + right) / 2;
            //右边是往下，不一定有坡峰
            if(nums[mid] > nums[mid + 1])
                right = mid;
                //右边是往上，一定能找到波峰
            else
                left = mid + 1;
        }
        //其中一个波峰
        return right;
    }

}
