package com.wclass.structalgorithm.tree;

// 测试链接：https://leetcode.com/problems/same-tree
public class d1_SameTree {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		// 两颗树有一颗为null,一颗不为null，则认为它们是不相同的
		if (p == null ^ q == null) {
			return false;
		}
		// 两棵树都为null，则认为它们是相同的
		if (p == null && q == null) {
			return true;
		}
		// 都不为空
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
