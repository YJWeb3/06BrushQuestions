package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d6_max_depth_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D6
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-58
 * @Version 1.0
 **/
public class RecursionS6D6 {

    public int maxDepth (TreeNode root) {
        //空节点没有深度
        if(root == null)
            return 0;
        //返回子树深度+1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
