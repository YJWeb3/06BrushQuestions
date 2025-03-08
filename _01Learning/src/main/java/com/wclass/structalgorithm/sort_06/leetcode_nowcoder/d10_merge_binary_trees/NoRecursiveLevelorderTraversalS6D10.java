package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d10_merge_binary_trees;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursiveLevelorderTraversalS6D10
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-16
 * @Version 1.0
 **/
public class NoRecursiveLevelorderTraversalS6D10 {

    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        //若只有一个节点返回另一个，两个都为null自然返回null
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        //合并根节点
        TreeNode head = new TreeNode(t1.val + t2.val);
        //连接后的树的层次遍历节点
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        //分别存两棵树的层次遍历节点
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q.offer(head);
        q1.offer(t1);
        q2.offer(t2);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node = q.poll();
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();
            TreeNode left1 = node1.left;
            TreeNode left2 = node2.left;
            TreeNode right1 = node1.right;
            TreeNode right2 = node2.right;
            if(left1 != null || left2 != null){
                //两个左节点都存在
                if(left1 != null && left2 != null){
                    TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    //新节点入队列
                    q.offer(left);
                    q1.offer(left1);
                    q2.offer(left2);
                    //只连接一个节点
                }else if(left1 != null)
                    node.left = left1;
                else
                    node.left = left2;
            }
            if(right1 != null || right2 != null){
                //两个右节点都存在
                if(right1 != null && right2 != null) {
                    TreeNode right = new TreeNode(right1.val + right2.val);
                    node.right = right;
                    //新节点入队列
                    q.offer(right);
                    q1.offer(right1);
                    q2.offer(right2);
                    //只连接一个节点
                }else if(right1 != null)
                    node.right = right1;
                else
                    node.right = right2;
            }
        }
        return head;
    }

}
