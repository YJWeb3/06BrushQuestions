package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d3_color_classification;

/**
 * @program: StructAlgorithm
 * @ClassName DoublePointerS16D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-29
 * @Version 1.0
 **/
public class DoublePointerS16D3 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p1 = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                ++p1;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if (p0 < p1) {
                    temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                ++p0;
                ++p1;
            }
        }
    }

}
