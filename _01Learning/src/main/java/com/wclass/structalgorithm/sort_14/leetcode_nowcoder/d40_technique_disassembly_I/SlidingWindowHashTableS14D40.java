package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d40_technique_disassembly_I;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName SlidingWindowHashTableS14D40
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-27
 * @Version 1.0
 **/
public class SlidingWindowHashTableS14D40 {

    public int dismantlingAction(String arr) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0, len = arr.length();
        for(int j = 0; j < len; j++) {
            if (dic.containsKey(arr.charAt(j)))
                i = Math.max(i, dic.get(arr.charAt(j))); // 更新左指针 i
            dic.put(arr.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }

        return res;

    }

}
