package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d4_level_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionS6D4
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-54
 * @Version 1.0
 **/
public class NoRecursionS6D4 {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer> > res = new ArrayList();
        if(root == null)
            //如果是空，则直接返回空数组
            return res;
        //队列存储，进行层次遍历
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            //记录二叉树的某一行
            ArrayList<Integer> row = new ArrayList();
            int n = q.size();
            //因先进入的是根节点，故每层节点多少，队列大小就是多少
            for(int i = 0; i < n; i++){
                TreeNode cur = q.poll();
                row.add(cur.val);
                //若是左右孩子存在，则存入左右孩子作为下一个层次
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
            //每一层加入输出
            res.add(row);
        }
        return res;
    }

}
