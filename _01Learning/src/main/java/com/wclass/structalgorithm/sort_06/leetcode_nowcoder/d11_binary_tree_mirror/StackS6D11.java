package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d11_binary_tree_mirror;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS6D11
 * @description:
 * @author: W哥
 * @create: 2024-09-26-21-17
 * @Version 1.0
 **/
public class StackS6D11 {

    public TreeNode Mirror (TreeNode pRoot) {
        //空树
        if(pRoot == null)
            return null;
        //辅助栈
        Stack<TreeNode> s = new Stack<TreeNode>();
        //根节点先进栈
        s.push(pRoot);
        while (!s.isEmpty()){
            TreeNode node = s.pop();
            //左右节点入栈
            if(node.left != null)
                s.push(node.left);
            if(node.right != null)
                s.push(node.right);
            //交换左右
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return pRoot;
    }
}
