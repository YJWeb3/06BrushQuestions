package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d38_count_good_nodes_bt‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS6D38
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-29
 * @Version 1.0
 **/
public class DFSS6D38 {

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode root, int pathMax) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val >= pathMax) {
            res++;
            pathMax = root.val;
        }
        res += dfs(root.left, pathMax) + dfs(root.right, pathMax);
        return res;
    }

}
