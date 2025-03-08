package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d1_most_elements;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS17D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-38
 * @Version 1.0
 **/
public class HashTableS17D1 {

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }

}
