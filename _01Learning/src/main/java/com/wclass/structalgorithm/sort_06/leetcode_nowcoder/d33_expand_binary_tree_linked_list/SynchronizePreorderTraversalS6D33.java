package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d33_expand_binary_tree_linked_list;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName SynchronizePreorderTraversalUnfoldingS6D33
 * @description:
 * @author: W哥
 * @create: 2024-09-27-21-12
 * @Version 1.0
 **/
public class SynchronizePreorderTraversalS6D33 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (prev != null) {
                prev.left = null;
                prev.right = curr;
            }
            TreeNode left = curr.left, right = curr.right;
            if (right != null) {
                stack.push(right);
            }
            if (left != null) {
                stack.push(left);
            }
            prev = curr;
        }
    }

}
