package com.wclass.structalgorithm.tree;

// 测试链接：https://leetcode.com/problems/balanced-binary-tree
public class d8_BalancedBinaryTree {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public static class Info {
		// 是否平衡
		public boolean isBalanced;
		// 高度
		public int height;

		public Info(boolean i, int h) {
			isBalanced = i;
			height = h;
		}
	}

	public static boolean isBalanced(TreeNode root) {
		return process(root).isBalanced;
	}

	public static Info process(TreeNode root) {
		// 没有节点，平衡二叉树
		if (root == null) {
			return new Info(true, 0);
		}
		// 左右子树分别处理
		Info leftInfo = process(root.left);
		Info rightInfo = process(root.right);
		// 左右高度取最大值 + 1
		int height = Math.max(leftInfo.height, rightInfo.height) + 1;
		// 左右子树都平衡且左右子树高度差不超过2，则说明平衡
		boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced
				&& Math.abs(leftInfo.height - rightInfo.height) < 2;
		// 返回平衡信息
		return new Info(isBalanced, height);
	}

}
