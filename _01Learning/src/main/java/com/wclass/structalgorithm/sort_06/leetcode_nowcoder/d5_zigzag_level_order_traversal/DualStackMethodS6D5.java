package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d5_zigzag_level_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName DualStackMethodS6D5
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-57
 * @Version 1.0
 **/
public class DualStackMethodS6D5 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        TreeNode head = pRoot;
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
        if(head == null)
            //如果是空，则直接返回空list
            return res;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        //放入第一次
        s1.push(head);
        while(!s1.isEmpty() || !s2.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            //遍历奇数层
            while(!s1.isEmpty()){
                TreeNode node = s1.pop();
                //记录奇数层
                temp.add(node.val);
                //奇数层的子节点加入偶数层
                if(node.left != null)
                    s2.push(node.left);
                if(node.right != null)
                    s2.push(node.right);
            }
            //数组不为空才添加
            if(temp.size() != 0)
                res.add(new ArrayList<Integer>(temp));
            //清空本层数据
            temp.clear();
            //遍历偶数层
            while(!s2.isEmpty()){
                TreeNode node = s2.pop();
                //记录偶数层
                temp.add(node.val);
                //偶数层的子节点加入奇数层
                if(node.right != null)
                    s1.push(node.right);
                if(node.left != null)
                    s1.push(node.left);
            }
            //数组不为空才添加
            if(temp.size() != 0)
                res.add(new ArrayList<Integer>(temp));
            //清空本层数据
            temp.clear();
        }
        return res;
    }
}
