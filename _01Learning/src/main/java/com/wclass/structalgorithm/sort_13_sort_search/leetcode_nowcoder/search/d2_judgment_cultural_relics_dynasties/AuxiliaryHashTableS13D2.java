package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d2_judgment_cultural_relics_dynasties;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS13D2
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-09
 * @Version 1.0
 **/
public class AuxiliaryHashTableS13D2 {

    public boolean checkDynasty(int[] places) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int place : places) {
            if(place == 0) continue; // 跳过未知朝代
            max = Math.max(max, place); // 最大编号朝代
            min = Math.min(min, place); // 最小编号朝代
            if(repeat.contains(place)) return false; // 若有重复，提前返回 false
            repeat.add(place); // 添加此朝代至 Set
        }
        return max - min < 5; // 最大编号朝代 - 最小编号朝代 < 5 则连续
    }

}
