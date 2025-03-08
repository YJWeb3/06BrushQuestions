package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d24_path_sum;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D24
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-52
 * @Version 1.0
 **/
public class RecursionS6D24 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
