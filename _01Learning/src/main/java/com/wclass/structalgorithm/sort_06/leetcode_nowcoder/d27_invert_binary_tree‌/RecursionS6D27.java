package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d27_invert_binary_tree‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D27
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-58
 * @Version 1.0
 **/
public class RecursionS6D27 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

}
