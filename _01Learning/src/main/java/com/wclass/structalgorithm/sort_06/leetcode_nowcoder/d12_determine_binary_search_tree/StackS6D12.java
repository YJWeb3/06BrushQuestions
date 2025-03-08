package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d12_determine_binary_search_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName StackS6D12
 * @description:
 * @author: W哥
 * @create: 2024-09-26-21-25
 * @Version 1.0
 **/
public class StackS6D12 {

    int pre = Integer.MIN_VALUE;
    //中序遍历
    public boolean isValidBST (TreeNode root) {
        if (root == null)
            return true;
        //先进入左子树
        if(!isValidBST(root.left))
            return false;
        if(root.val < pre)
            return false;
        //更新最值
        pre = root.val;
        //再进入右子树
        return isValidBST(root.right);
    }

}
