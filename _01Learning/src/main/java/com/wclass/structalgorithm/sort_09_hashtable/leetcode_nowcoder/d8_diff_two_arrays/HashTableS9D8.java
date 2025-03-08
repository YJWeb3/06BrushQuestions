package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d8_diff_two_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D8
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-14
 * @Version 1.0
 **/
public class HashTableS9D8 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map map1 = new HashMap();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i],i);
        }
        Map map2 = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i],i);
        }

        List<Integer> list2 = new ArrayList();
        map2.forEach((k,v) -> {
            if(null==map1.get(k)){
                list2.add((Integer) k);
            }
        });

        List<Integer> list1 = new ArrayList();
        map1.forEach((k,v) -> {
            if(null==map2.get(k)){
                list1.add((Integer) k);
            }
        });
        List<List<Integer>> list = new ArrayList();
        list.add(list1);
        list.add(list2);
        return list;
    }

}
