package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d28_max_depth_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS1D28
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-54
 * @Version 1.0
 **/
public class BFSS1D28 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

}
