package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d5_zigzag_level_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionLevelOrderTravelS6D5
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-56
 * @Version 1.0
 **/
public class NoRecursionLevelOrderTravelS6D5 {

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        TreeNode head = pRoot;
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
        if(head == null)
            //如果是空，则直接返回空list
            return res;
        //队列存储，进行层次遍历
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        temp.offer(head);
        TreeNode p;
        boolean flag = true;
        while(!temp.isEmpty()){
            //记录二叉树的某一行
            ArrayList<Integer> row = new ArrayList<Integer>();
            int n = temp.size();
            //奇数行反转，偶数行不反转
            flag = !flag;
            //因先进入的是根节点，故每层节点多少，队列大小就是多少
            for(int i = 0; i < n; i++){
                p = temp.poll();
                row.add(p.val);
                //若是左右孩子存在，则存入左右孩子作为下一个层次
                if(p.left != null)
                    temp.offer(p.left);
                if(p.right != null)
                    temp.offer(p.right);
            }
            //奇数行反转，偶数行不反转
            if(flag)
                Collections.reverse(row);
            res.add(row);
        }
        return res;
    }

}
