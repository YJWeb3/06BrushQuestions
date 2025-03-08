package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d2_judgment_cultural_relics_dynasties;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortTraverseS13D2
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-10
 * @Version 1.0
 **/
public class SortTraverseS13D2 {

    public boolean checkDynasty(int[] places) {
        int unknown = 0;
        Arrays.sort(places); // 数组排序
        for(int i = 0; i < 4; i++) {
            if(places[i] == 0) unknown++; // 统计未知朝代数量
            else if(places[i] == places[i + 1]) return false; // 若有重复，提前返回 false
        }
        return places[4] - places[unknown] < 5; // 最大编号朝代 - 最小编号朝代 < 5 则连续
    }

}
