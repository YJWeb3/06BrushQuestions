package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d18_reconstruct_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D18
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-39
 * @Version 1.0
 **/
public class RecursionS6D18 {

    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        int n = pre.length;
        int m = vin.length;
        //每个遍历都不能为0
        if(n == 0 || m == 0)
            return null;
        //构建根节点
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0; i < vin.length; i++){
            //找到中序遍历中的前序第一个元素
            if(pre[0] == vin[i]){
                //构建左子树
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(vin, 0, i));
                //构建右子树
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(vin, i + 1, vin.length));
                break;
            }
        }
        return root;
    }

}
