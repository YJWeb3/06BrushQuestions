package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d29_convert_sort_array_bst;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName InorderTraversalS6D29
 * @description:
 * @author: W哥
 * @create: 2024-09-27-21-01
 * @Version 1.0
 **/
public class InorderTraversalMLRootS6D29 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

}
