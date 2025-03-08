package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d9_unique_frequency_appearance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D9
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-15
 * @Version 1.0
 **/
public class HashTableS9D9 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }

}
