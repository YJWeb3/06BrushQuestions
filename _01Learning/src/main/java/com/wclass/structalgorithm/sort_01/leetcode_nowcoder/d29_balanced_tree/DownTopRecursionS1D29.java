package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d29_balanced_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName DownTopRecursionS1D29
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-56
 * @Version 1.0
 **/
public class DownTopRecursionS1D29 {

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
