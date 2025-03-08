package com.wclass.structalgorithm.tree;

// 测试链接：https://leetcode.com/problems/symmetric-tree
public class d2_SymmetricTree {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public static boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	public static boolean isMirror(TreeNode h1, TreeNode h2) {
		// 两颗树有一颗为null,一颗不为null，则认为它们是不相同的
		if (h1 == null ^ h2 == null) {
			return false;
		}
		// 两颗树都为null,则认为它们是相同的
		if (h1 == null && h2 == null) {
			return true;
		}
		return h1.val == h2.val && isMirror(h1.left, h2.right) && isMirror(h1.right, h2.left);
	}

}
