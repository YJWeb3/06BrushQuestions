package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d16_combinations_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName SearchBackTracking
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-59
 * @Version 1.0
 **/
public class SearchBackTracking {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }

}
