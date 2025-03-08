package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d28_max_depth_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS1D28
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-54
 * @Version 1.0
 **/
public class DFSS1D28 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
