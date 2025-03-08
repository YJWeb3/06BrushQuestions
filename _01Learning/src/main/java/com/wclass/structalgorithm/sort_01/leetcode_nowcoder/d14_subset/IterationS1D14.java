package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d14_subset;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName IterationS1D14
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-53
 * @Version 1.0
 **/
public class IterationS1D14 {

    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }

}
