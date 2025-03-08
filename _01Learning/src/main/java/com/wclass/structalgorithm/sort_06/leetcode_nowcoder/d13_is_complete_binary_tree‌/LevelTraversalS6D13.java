package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d13_is_complete_binary_tree‌;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName LevelTraversalS6D13
 * @description:
 * @author: W哥
 * @create: 2024-09-26-22-05
 * @Version 1.0
 **/
public class LevelTraversalS6D13 {

    public boolean isCompleteTree (TreeNode root) {
        //空树一定是完全二叉树
        if(root == null)
            return true;
        //辅助队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode cur;
        //定义一个首次出现的标记位
        boolean notComplete = false;
        while(!queue.isEmpty()){
            cur = queue.poll();
            //标记第一次遇到空节点
            if(cur == null){
                notComplete = true;
                continue;
            }
            //后续访问已经遇到空节点了，说明经过了叶子
            if(notComplete)
                return false;
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return true;
    }

}
