package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d8_TreeSumSmaller
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 15:37
 * @Author:NieZheng
 * @Version:1.0
 */
public class d8_TreeSumSmaller {

    public static int threeSumSmaller(int[] nums,int target){
        int ans = 0;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len -2; i++) {
            int left = i + 1,right = len - 1;
            while(left < right){
                if ( nums[i] + nums[left] + nums[right] < target){
                    ans += right - left;
                    left++;
                }else {
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] orginArrays = {-2,0,1,3};
        int result = threeSumSmaller(orginArrays,2);
        System.out.println(result);
    }
}
