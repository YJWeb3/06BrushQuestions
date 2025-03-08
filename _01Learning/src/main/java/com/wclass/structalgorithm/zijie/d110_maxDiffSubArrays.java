package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d110_maxDiffSubArrays
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/25 17:28
 * @Author:NieZheng
 * @Version:1.0
 */
public class d110_maxDiffSubArrays {

    public int maxDiffSubArrays(int[] nums){
        int n = nums.length;
        if (n < 2){
            return 0;
        }
        // maxSumOfLeft[i],maxSumOfLeft[i]分别表示从左到i的范围内的子数组最大/最小和
        int[] maxSumOfLeft = new int[n],minSumOfLeft = new int[n];
        // maxSumOfRight[i],maxSumOfRight[i]分别表示从右到i的范围内的子数组最大/最小和
        int[] maxSumOfRight = new int[n],minSumOfRight = new int[n];
        // 求从左到i的范围内的子数组最小和
        maxSumOfLeft[0] = nums[0];
        for (int i = 0,now = nums[n - 1];i < n;i++) {
            now = Math.max(nums[i],now + nums[i]);
            maxSumOfLeft[i] = Math.max(maxSumOfLeft[i - 1],now);
        }
        // 求从右到i范围内的子数组最大和
        maxSumOfRight[n - 1] = nums[n - 1];
        for (int i = n - 2,now = nums[n - 1]; i >= 0 ; i--) {
            now = Math.max(nums[i],now + nums[i]);
            maxSumOfRight[i] = Math.max(maxSumOfRight[i + 1],now);
        }
        // 从左到i的范围内的子数组最小和
        minSumOfLeft[0] = nums[0];
        for (int i = 1,now = nums[0]; i < n; i++) {
            now = Math.min(nums[i],now + nums[i]);
            minSumOfLeft[i] = Math.min(minSumOfLeft[i - 1],now);
        }
        // 从右到i的范围内的子数组最小和
        minSumOfLeft[n - 1] = nums[n - 1];
        for (int i = n - 2,now = nums[n - 1]; i >= 0; i--) {
            now = Math.min(nums[i],now + nums[i]);
            minSumOfRight[i] = Math.min(minSumOfRight[i - 1],now);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            // max(左大右小的差值，左小右大的差值
            ans = Math.max(ans,Math.max(Math.abs(maxSumOfLeft[i] - minSumOfRight[i + 1]),Math.abs(minSumOfLeft[i] - maxSumOfRight[i + 1])));
        }
        return ans;
    }
}

