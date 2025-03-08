package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d20_same_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS6D20
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-45
 * @Version 1.0
 **/
public class DFSS6D20 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}
