package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d9_TreeSumClosest
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 16:09
 * @Author:NieZheng
 * @Version:1.0
 */
public class d9_TreeSumClosest {

    public static int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1,end = nums.length - 1;
            while ( start < end ){
                int sum = nums[start] + nums[end] + nums[i];
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] orginArrays = {2,7,11,15};
        int result = threeSumClosest(orginArrays,2);
        System.out.println(result);
    }
}
