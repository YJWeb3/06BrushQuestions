package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d4_first_missing_positive;

import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D4
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-07
 * @Version 1.0
 **/
public class HashTableS9D4 {

    public int minNumberDisappeared (int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        //哈希表记录数组中出现的每个数字
        for(int i = 0; i < n; i++)
            mp.put(nums[i], 1);
        int res = 1;
        //从1开始找到哈希表中第一个没有出现的正整数
        while(mp.containsKey(res))
            res++;
        return res;
    }

}
