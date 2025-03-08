package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d41_bft_search;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D41
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-33
 * @Version 1.0
 **/
public class RecursionS6D41 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        }
        return searchBST(val < root.val ? root.left : root.right, val);
    }

}
