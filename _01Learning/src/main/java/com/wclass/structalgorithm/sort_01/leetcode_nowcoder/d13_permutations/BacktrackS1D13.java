package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d13_permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName BackTrackS1D13
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-52
 * @Version 1.0
 **/
public class BacktrackS1D13 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

}
