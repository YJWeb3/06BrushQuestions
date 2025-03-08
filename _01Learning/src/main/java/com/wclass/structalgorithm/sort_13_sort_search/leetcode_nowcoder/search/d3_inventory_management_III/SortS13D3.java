package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d3_inventory_management_III;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortS13D3
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-11
 * @Version 1.0
 **/
public class SortS13D3 {

    public int[] inventoryManagement(int[] stock, int cnt) {
        int[] vec = new int[cnt];
        Arrays.sort(stock);
        for (int i = 0; i < cnt; ++i) {
            vec[i] = stock[i];
        }
        return vec;
    }

}
