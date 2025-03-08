package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d10_move_breakdown_II;

import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS13D10
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-28
 * @Version 1.0
 **/
public class HashTableS13D10 {

    public char dismantlingAction(String arr) {
        HashMap<Character, Boolean> hmap = new HashMap<>();
        char[] sc = arr.toCharArray();
        for(char c : sc)
            hmap.put(c, !hmap.containsKey(c));
        for(char c : sc)
            if(hmap.get(c)) return c;
        return ' ';
    }

}
