package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d31_kth_smallest_element_bst‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName InorderTraversalS6D31
 * @description:
 * @author: W哥
 * @create: 2024-09-27-21-06
 * @Version 1.0
 **/
public class InorderTraversalS6D31 {

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }

}
