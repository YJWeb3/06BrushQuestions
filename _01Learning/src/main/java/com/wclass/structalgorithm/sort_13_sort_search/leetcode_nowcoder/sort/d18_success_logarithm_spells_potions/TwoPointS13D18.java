package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d18_success_logarithm_spells_potions;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointS13D18
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-43
 * @Version 1.0
 **/
public class TwoPointS13D18 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        int[][] idx = new int[n][2];
        for (int i = 0; i < n; ++i) {
            idx[i][0] = spells[i];
            idx[i][1] = i;
        }
        Arrays.sort(potions);
        for (int i = 0, j = m - 1; i < j; ++i, --j) {
            int temp = potions[i];
            potions[i] = potions[j];
            potions[j] = temp;
        }
        Arrays.sort(idx, (a, b) -> a[0] - b[0]);
        for (int i = 0, j = 0; i < n; ++i) {
            int p = idx[i][1];
            int v = idx[i][0];
            while (j < m && (long) potions[j] * v >= success) {
                ++j;
            }
            res[p] = j;
        }
        return res;
    }

}
