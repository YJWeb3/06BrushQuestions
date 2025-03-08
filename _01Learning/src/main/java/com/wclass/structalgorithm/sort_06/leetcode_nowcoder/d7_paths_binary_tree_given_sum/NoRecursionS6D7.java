package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d7_paths_binary_tree_given_sum;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionS6D7
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-00
 * @Version 1.0
 **/
public class NoRecursionS6D7 {

    public boolean hasPathSum (TreeNode root, int sum) {
        //空节点找不到路径
        if(root == null)
            return false;
        //栈辅助深度优先遍历
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        //跟随s1记录到相应节点为止的路径和
        Stack<Integer> s2 = new Stack<Integer>();
        s1.push(root);
        s2.push(root.val);
        while(!s1.isEmpty()){
            //弹出相应节点
            TreeNode temp = s1.pop();
            //弹出到该点为止的当前路径和
            int cur_sum = s2.pop();
            //叶子节点且当前路径和等于sum
            if(temp.left == null && temp.right == null && cur_sum == sum)
                return true;
            //左节点及路径和入栈
            if(temp.left != null){
                s1.push(temp.left);
                s2.push(cur_sum + temp.left.val);
            }
            //右节点及路径和入栈
            if(temp.right != null){
                s1.push(temp.right);
                s2.push(cur_sum + temp.right.val);
            }
        }
        return false;
    }

}
