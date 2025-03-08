package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d42_remove_bst_node;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName IterationS6D42
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-35
 * @Version 1.0
 **/
public class IterationS6D42 {

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root, curParent = null;
        while (cur != null && cur.val != key) {
            curParent = cur;
            if (cur.val > key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        if (cur == null) {
            return root;
        }
        if (cur.left == null && cur.right == null) {
            cur = null;
        } else if (cur.right == null) {
            cur = cur.left;
        } else if (cur.left == null) {
            cur = cur.right;
        } else {
            TreeNode successor = cur.right, successorParent = cur;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            if (successorParent.val == cur.val) {
                successorParent.right = successor.right;
            } else {
                successorParent.left = successor.right;
            }
            successor.right = cur.right;
            successor.left = cur.left;
            cur = successor;
        }
        if (curParent == null) {
            return cur;
        } else {
            if (curParent.left != null && curParent.left.val == key) {
                curParent.left = cur;
            } else {
                curParent.right = cur;
            }
            return root;
        }
    }

}
