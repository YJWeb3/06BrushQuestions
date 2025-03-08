package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d10_merge_binary_trees;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursivePreorderTraversalS6D10‌
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-15
 * @Version 1.0
 **/
public class RecursivePreorderTraversalS6D10 {

    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        //若只有一个节点返回另一个，两个都为null自然返回null
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        //根左右的方式递归
        TreeNode head = new TreeNode(t1.val + t2.val);
        head.left = mergeTrees(t1.left, t2.left);
        head.right = mergeTrees(t1.right, t2.right);
        return head;
    }

}
