package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d9_symmetric_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName LevelTraversalS6D9
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-14
 * @Version 1.0
 **/
public class LevelTraversalS6D9 {

    boolean isSymmetrical(TreeNode pRoot) {
        //空树为对称的
        if(pRoot == null)
            return true;
        //辅助队列用于从两边层次遍历
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.offer(pRoot.left);
        q2.offer(pRoot.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            //分别从左边和右边弹出节点
            TreeNode left = q1.poll();
            TreeNode right = q2.poll();
            //都为空暂时对称
            if(left == null && right == null)
                continue;
            //某一个为空或者数字不相等则不对称
            if(left == null || right == null || left.val != right.val)
                return false;
            //从左往右加入队列
            q1.offer(left.left);
            q1.offer(left.right);
            //从右往左加入队列
            q2.offer(right.right);
            q2.offer(right.left);
        }
        //都检验完都是对称的
        return true;
    }

}
