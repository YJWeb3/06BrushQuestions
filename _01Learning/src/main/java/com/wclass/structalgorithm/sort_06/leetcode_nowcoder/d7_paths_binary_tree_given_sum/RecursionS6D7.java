package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d7_paths_binary_tree_given_sum;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D7
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-00
 * @Version 1.0
 **/
public class RecursionS6D7 {

    public boolean hasPathSum (TreeNode root, int sum) {
        //空节点找不到路径
        if(root == null)
            return false;
        //叶子节点，且路径和为sum
        if(root.left == null && root.right == null && sum - root.val == 0)
            return true;
        //递归进入子节点
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
