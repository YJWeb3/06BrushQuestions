package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d1_splitting_candy;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D1
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-38
 * @Version 1.0
 **/
public class GreedyS14D1 {

    public int candy (int[] arr) {
        int n=arr.length;
        if(n<=1)
            return n;
        int[] nums = new int[n];
        //初始化
        for(int i = 0; i < n; i++)
            nums[i] = 1;
        //从左到右遍历
        for(int i = 1; i < arr.length; i++){
            //如果右边在递增，每次增加一个
            if(arr[i] > arr[i - 1])
                nums[i] = nums[i - 1] + 1;
        }
        //记录总糖果数
        int res = nums[arr.length - 1];
        //从右到左遍历
        for(int i = arr.length - 2; i >= 0; i--){
            //如果左边更大但是糖果数更小
            if(arr[i] > arr[i + 1] && nums[i] <= nums[i + 1])
                nums[i] = nums[i + 1] + 1;
            //累加和
            res += nums[i];
        }
        return res;
    }

}
