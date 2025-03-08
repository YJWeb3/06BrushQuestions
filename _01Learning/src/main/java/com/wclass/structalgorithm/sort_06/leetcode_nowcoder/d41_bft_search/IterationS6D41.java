package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d41_bft_search;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName IterationS6D41
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-34
 * @Version 1.0
 **/
public class IterationS6D41 {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (val == root.val) {
                return root;
            }
            root = val < root.val ? root.left : root.right;
        }
        return null;
    }

}
