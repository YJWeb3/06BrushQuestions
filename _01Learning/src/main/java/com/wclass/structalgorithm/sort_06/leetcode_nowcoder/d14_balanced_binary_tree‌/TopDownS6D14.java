package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d14_balanced_binary_tree‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName TopDownS6D14
 * @description:
 * @author: W哥
 * @create: 2024-09-26-22-08
 * @Version 1.0
 **/
public class TopDownS6D14 {

    //计算该子树深度函数
    public int deep(TreeNode root){
        //空节点深度为0
        if(root == null)
            return 0;
        //递归算左右子树的深度
        int left = deep(root.left);
        int right = deep(root.right);
        //子树最大深度加上自己
        return (left > right) ? left + 1 : right + 1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        //空树为平衡二叉树
        if (root == null)
            return true;
        int left = deep(root.left);
        int right = deep(root.right);
        //左子树深度减去右子树相差绝对值大于1
        if(left - right > 1 || left - right < -1)
            return false;
        //同时，左右子树还必须是平衡的
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

}
