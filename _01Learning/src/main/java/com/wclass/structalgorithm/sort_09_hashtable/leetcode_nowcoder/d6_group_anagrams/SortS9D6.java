package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d6_group_anagrams;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName SortS9D6
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-11
 * @Version 1.0
 **/
public class SortS9D6 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
