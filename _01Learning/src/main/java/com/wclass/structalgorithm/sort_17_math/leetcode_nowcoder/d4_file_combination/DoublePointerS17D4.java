package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d4_file_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DoublePointerS17D4
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-49
 * @Version 1.0
 **/
public class DoublePointerS17D4 {

    public int[][] fileCombination(int target) {
        List<int[]> vec = new ArrayList<int[]>();
        for (int l = 1, r = 2; l < r;) {
            int sum = (l + r) * (r - l + 1) / 2;
            if (sum == target) {
                int[] res = new int[r - l + 1];
                for (int i = l; i <= r; ++i) {
                    res[i - l] = i;
                }
                vec.add(res);
                l++;
            } else if (sum < target) {
                r++;
            } else {
                l++;
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }

}
