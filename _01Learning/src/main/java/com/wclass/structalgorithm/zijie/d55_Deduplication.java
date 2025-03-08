package com.wclass.structalgorithm.zijie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:d55_Deduplication
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 14:25
 * @Author:NieZheng
 * @Version:1.0
 */
public class d55_Deduplication {

    // 方式一：建立一个指针，指针指向目前位置不同的数的末尾，如果当前元素与末尾不同，则加入到末尾
    // O(nlogn) time,O(1) extra space
    public int deduplication(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]){
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }

    // 方式二：使用Set的解法，Set会自动过滤掉重复的元素。
    // O(n) time,O(n) extra space
    public static int deduplication2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        for (Integer i : set){
            nums[result++] = i;
        }
        return result;
    }
}
