package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d24_k_subarray;

import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName PrefixSumHashTableS2D24
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-14
 * @Version 1.0
 **/
public class PreSumHashTableS2D24 {

    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap< Integer, Integer > mp = new HashMap < > ();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

}
