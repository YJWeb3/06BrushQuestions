package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d15_increasing_triplet_subsequence;

/**
 * @program: StructAlgorithm
 * @ClassName DoublyLinkedListS2d15
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-38
 * @Version 1.0
 **/
public class BidirectionalTraversalS2d15 {

    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int[] leftMin = new int[n];
        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > leftMin[i - 1] && nums[i] < rightMax[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
