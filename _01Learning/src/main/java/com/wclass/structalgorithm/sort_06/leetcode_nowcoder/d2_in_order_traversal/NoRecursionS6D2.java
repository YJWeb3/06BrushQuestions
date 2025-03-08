package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d2_in_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionS6D2
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-46
 * @Version 1.0
 **/
public class NoRecursionS6D2 {

    public int[] inorderTraversal (TreeNode root) {
        //添加遍历结果的数组
        List<Integer> list = new ArrayList();
        Stack<TreeNode> s = new Stack<TreeNode>();
        //空树返回空数组
        if(root == null)
            return new int[0];
        //当树节点不为空或栈中有节点时
        while(root != null || !s.isEmpty()){
            //每次找到最左节点
            while(root != null){
                s.push(root);
                root = root.left;
            }
            //访问该节点
            TreeNode node = s.pop();
            list.add(node.val);
            //进入右节点
            root = node.right;
        }
        //返回的结果
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

}
