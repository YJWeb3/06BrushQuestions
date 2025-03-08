package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d39_longest_zigzag_path_bt;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS6D39
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-31
 * @Version 1.0
 **/
public class DFSS6D39 {

    private List<Integer> sum = new ArrayList<Integer>();

    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int ans = 0;
        for (int i = 0; i < sum.size(); ++i) {
            if (sum.get(i) > sum.get(ans)) {
                ans = i;
            }
        }
        return ans + 1; // 层号从 1 开始
    }

    private void dfs(TreeNode node, int level) {
        if (level == sum.size()) {
            sum.add(node.val);
        } else {
            sum.set(level, sum.get(level) + node.val);
        }
        if (node.left != null) {
            dfs(node.left, level + 1);
        }
        if (node.right != null) {
            dfs(node.right, level + 1);
        }
    }

}
