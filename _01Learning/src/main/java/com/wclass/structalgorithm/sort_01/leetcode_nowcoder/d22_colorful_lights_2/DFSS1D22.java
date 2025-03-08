package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d22_colorful_lights_2;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS1D22
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-27
 * @Version 1.0
 **/
public class DFSS1D22 {

    Map<Integer, List<Integer>> map = new HashMap<>();
    int max = -1;
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= max; i++) ans.add(map.get(i));
        return ans;
    }
    void dfs(TreeNode root, int depth) {
        if (root == null) return ;
        max = Math.max(max, depth);
        dfs(root.left, depth + 1);
        List<Integer> list = map.getOrDefault(depth, new ArrayList<>());
        list.add(root.val);
        map.put(depth, list);
        dfs(root.right, depth + 1);
    }

}
