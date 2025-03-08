package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d18_success_logarithm_spells_potions;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D18
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-43
 * @Version 1.0
 **/
public class BinarySearchS13D18 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            long t = (success + spells[i] - 1) / spells[i] - 1;
            res[i] = m - binarySearch(potions, 0, m - 1, t);
        }
        return res;
    }

    public int binarySearch(int[] arr, int lo, int hi, long target) {
        int res = hi + 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                res = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }

}
