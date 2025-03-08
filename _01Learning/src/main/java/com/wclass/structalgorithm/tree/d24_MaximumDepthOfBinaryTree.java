package com.wclass.structalgorithm.tree;

// 测试链接：https://leetcode.com/problems/maximum-depth-of-binary-tree
public class d24_MaximumDepthOfBinaryTree {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	// 以root为头的树，最大高度是多少返回！
	public static int maxDepth(TreeNode root) {
		// 递归终止条件
		if (root == null) {
			return 0;
		}
		// 左右子树谁大取谁
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
