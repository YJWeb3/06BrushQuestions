package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d6_max_depth_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName LevelTraversalS6D6
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-58
 * @Version 1.0
 **/
public class LevelTraversalS6D6 {

    public int maxDepth (TreeNode root) {
        //空节点没有深度
        if(root == null)
            return 0;
        //队列维护层次后续节点
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        //根入队
        q.offer(root);
        //记录深度
        int res = 0;
        //层次遍历
        while(!q.isEmpty()){
            //记录当前层有多少节点
            int n = q.size();
            //遍历完这一层，再进入下一层
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                //添加下一层的左右节点
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
            }
            //深度加1
            res++;
        }
        return res;
    }

}
