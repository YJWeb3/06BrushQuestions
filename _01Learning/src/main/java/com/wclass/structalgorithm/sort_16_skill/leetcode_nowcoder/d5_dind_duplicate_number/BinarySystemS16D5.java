package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d5_dind_duplicate_number;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySystemS16D5
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-32
 * @Version 1.0
 **/
public class BinarySystemS16D5 {

    public int findDuplicate(int[] nums) {
        int n = nums.length, ans = 0;
        int bit_max = 31;
        while (((n - 1) >> bit_max) == 0) {
            bit_max -= 1;
        }
        for (int bit = 0; bit <= bit_max; ++bit) {
            int x = 0, y = 0;
            for (int i = 0; i < n; ++i) {
                if ((nums[i] & (1 << bit)) != 0) {
                    x += 1;
                }
                if (i >= 1 && ((i & (1 << bit)) != 0)) {
                    y += 1;
                }
            }
            if (x > y) {
                ans |= 1 << bit;
            }
        }
        return ans;
    }

}
