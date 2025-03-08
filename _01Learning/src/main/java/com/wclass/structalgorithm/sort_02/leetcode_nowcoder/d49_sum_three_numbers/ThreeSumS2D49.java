package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d49_sum_three_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName ThreeSumS2D49
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-09
 * @Version 1.0
 **/
public class ThreeSumS2D49 {

    public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                // 跳过重复固定值
                if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // 跳过重复解
                        while (left < right && nums[left] == nums[left+1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right-1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
            return result;
        }
    }

}
