package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d11_binary_tree_mirror;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D11
 * @description:
 * @author: W哥
 * @create: 2024-09-26-21-17
 * @Version 1.0
 **/
public class RecursionS6D11 {

    public TreeNode Mirror (TreeNode pRoot) {
        //空树返回
        if(pRoot == null)
            return null;
        //先递归子树
        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);
        //交换
        pRoot.left = right;
        pRoot.right = left;
        return pRoot;
    }

}
