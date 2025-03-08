package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d10_move_breakdown_II;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName OrderedHashTableS13D10
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-28
 * @Version 1.0
 **/
public class OrderedHashTableS13D10 {

    public char dismantlingAction(String arr) {
        Map<Character, Boolean> hmap = new LinkedHashMap<>();
        char[] sc = arr.toCharArray();
        for(char c : sc)
            hmap.put(c, !hmap.containsKey(c));
        for(Map.Entry<Character, Boolean> d : hmap.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }

}
