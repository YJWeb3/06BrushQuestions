package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d26_divide_letter_intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D26
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-51
 * @Version 1.0
 **/
public class GreedyS14D26 {

    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }

}
