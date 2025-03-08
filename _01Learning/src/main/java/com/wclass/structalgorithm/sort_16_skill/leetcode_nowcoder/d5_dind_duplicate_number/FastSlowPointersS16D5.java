package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d5_dind_duplicate_number;

/**
 * @program: StructAlgorithm
 * @ClassName FastSlowPointersS16D5
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-32
 * @Version 1.0
 **/
public class FastSlowPointersS16D5 {

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
