package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d78_SecondMax
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 11:37
 * @Author:NieZheng
 * @Version:1.0
 */
public class d78_SecondMax {

    public int secondMax(int[] nums){
        int max = Math.max(nums[0],nums[1]);
        int second = Math.min(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > max){
                second = max;
                max = nums[i];
            }else if (nums[i] > second){
                second = nums[i];
            }
        }
        return second;
    }
}
