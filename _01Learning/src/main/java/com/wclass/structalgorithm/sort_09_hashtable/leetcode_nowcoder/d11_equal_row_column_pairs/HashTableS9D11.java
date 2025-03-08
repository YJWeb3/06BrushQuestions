package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d11_equal_row_column_pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D11
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-18
 * @Version 1.0
 **/
public class HashTableS9D11 {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> cnt = new HashMap<List<Integer>, Integer>();
        for (int[] row : grid) {
            List<Integer> arr = new ArrayList<Integer>();
            for (int num : row) {
                arr.add(num);
            }
            cnt.put(arr, cnt.getOrDefault(arr, 0) + 1);
        }

        int res = 0;
        for (int j = 0; j < n; j++) {
            List<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(grid[i][j]);
            }
            if (cnt.containsKey(arr)) {
                res += cnt.get(arr);
            }
        }
        return res;
    }

}
