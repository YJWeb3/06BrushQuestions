package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d21_colorful_lights_1;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @program: StructAlgorithm
 * @ClassName DFSS1D21
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-24
 * @Version 1.0
 **/
public class DFSS1D21 {

    Map<Integer, List<Integer>> map = new HashMap<>();
    int max = -1, cnt = 0;
    public int[] levelOrder(TreeNode root) {
        dfs(root, 0);
        int[] ans = new int[cnt];
        for (int i = 0, idx = 0; i <= max; i++) {
            for (int x : map.get(i)) ans[idx++] = x;
        }
        return ans;
    }
    void dfs(TreeNode root, int depth) {
        if (root == null) return ;
        max = Math.max(max, depth);
        cnt++;
        dfs(root.left, depth + 1);
        List<Integer> list = map.getOrDefault(depth, new ArrayList<Integer>());
        list.add(root.val);
        map.put(depth, list);
        dfs(root.right, depth + 1);
    }

}
