package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d8_count_frequency_occurrence_target_scores;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D8
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-26
 * @Version 1.0
 **/
public class BinarySearchS13D8 {

    public int countTarget(int[] scores, int target) {
        int leftIdx = binarySearch(scores, target, true);
        int rightIdx = binarySearch(scores, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < scores.length && scores[leftIdx] == target && scores[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
