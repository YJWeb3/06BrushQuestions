package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d50_receive_rainwater02;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D50
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-15
 * @Version 1.0
 **/
public class TwoPointersS2D50 {

    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }

}
