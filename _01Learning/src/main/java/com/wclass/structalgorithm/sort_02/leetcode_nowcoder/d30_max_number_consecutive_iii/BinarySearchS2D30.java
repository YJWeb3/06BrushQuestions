package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d30_max_number_consecutive_iii;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS2D30
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-29
 * @Version 1.0
 **/
public class BinarySearchS2D30 {

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int[] P = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            P[i] = P[i - 1] + (1 - nums[i - 1]);
        }

        int ans = 0;
        for (int right = 0; right < n; ++right) {
            int left = binarySearch(P, P[right + 1] - k);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public int binarySearch(int[] P, int target) {
        int low = 0, high = P.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (P[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
