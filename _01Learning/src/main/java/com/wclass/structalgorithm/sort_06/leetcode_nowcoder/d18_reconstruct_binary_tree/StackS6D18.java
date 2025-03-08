package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d18_reconstruct_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS6D18
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-40
 * @Version 1.0
 **/
public class StackS6D18 {

    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        int n = pre.length;
        int m = vin.length;
        //每个遍历都不能为0
        if(n == 0 || m == 0)
            return null;
        Stack<TreeNode> s = new Stack<TreeNode>();
        //首先建立前序第一个即根节点
        TreeNode root = new TreeNode(pre[0]);
        TreeNode cur = root;
        for(int i = 1, j = 0; i < n; i++){
            //要么旁边这个是它的左节点
            if(cur.val != vin[j]){
                cur.left = new TreeNode(pre[i]);
                s.push(cur);
                //要么旁边这个是它的右节点，或者祖先的右节点
                cur = cur.left;
            }else{
                j++;
                //弹出到符合的祖先
                while(!s.isEmpty() && s.peek().val == vin[j]){
                    cur = s.pop();
                    j++;
                }
                //添加右节点
                cur.right = new TreeNode(pre[i]);
                cur = cur.right;
            }
        }
        return root;
    }

}
