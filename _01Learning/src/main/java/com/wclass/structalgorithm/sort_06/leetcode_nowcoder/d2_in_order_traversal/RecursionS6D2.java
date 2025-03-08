package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d2_in_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D2
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-46
 * @Version 1.0
 **/
public class RecursionS6D2 {

    public void inorder(List<Integer> list, TreeNode root){
        //遇到空节点则返回
        if(root == null)
            return;
        //先去左子树
        inorder(list, root.left);
        //再访问根节点
        list.add(root.val);
        //最后去右子树
        inorder(list, root.right);
    }

    public int[] inorderTraversal (TreeNode root) {
        //添加遍历结果的数组
        List<Integer> list = new ArrayList();
        //递归中序遍历
        inorder(list, root);
        //返回的结果
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

}
