package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d3_color_classification;

/**
 * @program: StructAlgorithm
 * @ClassName SinglePointerS16D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-29
 * @Version 1.0
 **/
public class SinglePointerS16D3 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }

}
