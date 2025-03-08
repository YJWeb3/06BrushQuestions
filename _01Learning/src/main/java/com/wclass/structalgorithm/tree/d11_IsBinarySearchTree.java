package com.wclass.structalgorithm.tree;

public class d11_IsBinarySearchTree {

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
		// 是否是二叉搜索树
		public boolean isBST;
		// 充当左子树的最大值
		public int max;
		// 充当右子树的最小值
		public int min;

		public Info(boolean is, int ma, int mi) {
			isBST = is;
			max = ma;
			min = mi;
		}
	}


	/**
	 * 处理一棵树，判断是否为二叉搜索树
	 * @param x
	 * @return
	 */
	public static Info process(TreeNode x) {
		// 根结点为null，返回null
		if (x == null) {
			return null;
		}
		// 递归左子树·
		Info leftInfo = process(x.left);
		// 右子树的信息
		Info rightInfo = process(x.right);
		// 最大值
		int max = x.val;
		// 最小值
		int min = x.val;

		// 左子树信息不为null，获取最大值
		if (leftInfo != null) {
			max = Math.max(leftInfo.max, max);
			min = Math.min(leftInfo.min, min);
		}

		// 右子树信息不为null，获取最大值
		if (rightInfo != null) {
			max = Math.max(rightInfo.max, max);
			min = Math.min(rightInfo.min, min);
		}

		// 默认不是二叉搜索树
		boolean isBST = false;
		// 左子树是否为二叉搜索树
		boolean leftIsBst = leftInfo == null ? true : leftInfo.isBST;
		// 右子树是否为二叉搜索树
		boolean rightIsBst = rightInfo == null ? true : rightInfo.isBST;
		// 左子树的最大值小于根结点的情况
		boolean leftMaxLessX = leftInfo == null ? true : (leftInfo.max < x.val);
		// 右子树小于根结点的情况
		boolean rightMinMoreX = rightInfo == null ? true : (rightInfo.min > x.val);
		if (leftIsBst && rightIsBst && leftMaxLessX && rightMinMoreX) {
			isBST = true;
		}
		return new Info(isBST, max, min);
	}

}
