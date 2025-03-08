package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d7_find_copy_file;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS13D7
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-24
 * @Version 1.0
 **/
public class HashTableS13D7 {

    public int findRepeatDocument(int[] documents) {
        Set<Integer> hmap = new HashSet<>();
        for(int doc : documents) {
            if(hmap.contains(doc)) return doc;
            hmap.add(doc);
        }
        return -1;
    }

}
