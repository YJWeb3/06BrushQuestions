package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d27_tree_target_node;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS1D27
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-52
 * @Version 1.0
 **/
public class DFSS1D27 {

    int res, cnt;
    public int findTargetNode(TreeNode root, int cnt) {
        this.cnt = cnt;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(cnt == 0) return;
        if(--cnt == 0) res = root.val;
        dfs(root.left);
    }

}
