package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d28_yang_hui_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName MathS14D28
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-55
 * @Version 1.0
 **/
public class MathS14D28 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }

}
