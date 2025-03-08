package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d29_balanced_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName TopDownRecursionS1D29
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-56
 * @Version 1.0
 **/
public class TopDownRecursionS1D29 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

}
