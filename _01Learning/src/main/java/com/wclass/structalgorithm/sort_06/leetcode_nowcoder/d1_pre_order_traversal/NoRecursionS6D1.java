package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d1_pre_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionS6D1
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-46
 * @Version 1.0
 **/
public class NoRecursionS6D1 {

    public int[] preorderTraversal (TreeNode root) {
        //添加遍历结果的数组
        List<Integer> list = new ArrayList();
        Stack<TreeNode> s = new Stack<TreeNode>();
        //空树返回空数组
        if(root == null)
            return new int[0];
        //根节点先进栈
        s.push(root);
        while(!s.isEmpty()){
            //每次栈顶就是访问的元素
            TreeNode node = s.pop();
            list.add(node.val);
            //如果右边还有右子节点进栈
            if(node.right != null)
                s.push(node.right);
            //如果左边还有左子节点进栈
            if(node.left != null)
                s.push(node.left);
        }
        //返回的结果
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

}
