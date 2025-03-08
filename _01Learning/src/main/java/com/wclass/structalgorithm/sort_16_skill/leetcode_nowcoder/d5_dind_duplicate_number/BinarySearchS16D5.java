package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d5_dind_duplicate_number;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS16D5
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-31
 * @Version 1.0
 **/
public class BinarySearchS16D5 {

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }

}
