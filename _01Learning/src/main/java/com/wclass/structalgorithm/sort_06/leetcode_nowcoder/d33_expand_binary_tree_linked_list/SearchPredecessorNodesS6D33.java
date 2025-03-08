package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d33_expand_binary_tree_linked_list;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName SearchPredecessorNodesS6D33
 * @description:
 * @author: W哥
 * @create: 2024-09-27-21-13
 * @Version 1.0
 **/
public class SearchPredecessorNodesS6D33 {

    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode next = curr.left;
                TreeNode predecessor = next;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                predecessor.right = curr.right;
                curr.left = null;
                curr.right = next;
            }
            curr = curr.right;
        }
    }

}
