package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d4_file_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName EnumerationMathematicalOptimizationS17D4
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-49
 * @Version 1.0
 **/
public class EnumerationMathematicalOptimizationS17D4 {

    public int[][] fileCombination(int target) {
        List<int[]> vec = new ArrayList<int[]>();
        int sum = 0, limit = (target - 1) / 2; // (target - 1) / 2 等效于 target / 2 下取整
        for (int x = 1; x <= limit; ++x) {
            long delta = 1 - 4 * (x - (long) x * x - 2 * target);
            if (delta < 0) {
                continue;
            }
            int delta_sqrt = (int) Math.sqrt(delta + 0.5);
            if ((long) delta_sqrt * delta_sqrt == delta && (delta_sqrt - 1) % 2 == 0) {
                int y = (-1 + delta_sqrt) / 2; // 另一个解(-1-delta_sqrt)/2必然小于0，不用考虑
                if (x < y) {
                    int[] res = new int[y - x + 1];
                    for (int i = x; i <= y; ++i) {
                        res[i - x] = i;
                    }
                    vec.add(res);
                }
            }
        }
        return vec.toArray(new int[vec.size()][]);
    }

}
