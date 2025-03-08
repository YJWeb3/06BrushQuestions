package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d3_color_classification;

/**
 * @program: StructAlgorithm
 * @ClassName DoublePointer02S16D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-29
 * @Version 1.0
 **/
public class DoublePointer02S16D3 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int p0 = 0, p2 = n - 1;
        for (int i = 0; i <= p2; ++i) {
            while (i <= p2 && nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                ++p0;
            }
        }
    }

}
