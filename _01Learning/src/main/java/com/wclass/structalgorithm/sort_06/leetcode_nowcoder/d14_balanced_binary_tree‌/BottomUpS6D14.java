package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d14_balanced_binary_tree‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName BottomUp
 * @description:
 * @author: W哥
 * @create: 2024-09-26-22-08
 * @Version 1.0
 **/
public class BottomUpS6D14 {

    public boolean IsBalanced_Solution(TreeNode root) {
        //空树也是平衡二叉树
        if(root == null)
            return true;
        return getdepth(root) != -1;
    }

    public int getdepth(TreeNode root) {
        if(root == null)
            return 0;
        //递归计算当前root左右子树的深度差
        int left = getdepth(root.left);
        //当前节点左子树不平衡，则该树不平衡
        if(left < 0)
            return -1;
        int right = getdepth(root.right);
        //当前节点右子树不平衡，则该树不平衡
        if(right < 0)
            return -1;
        //计算深度差
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

}
