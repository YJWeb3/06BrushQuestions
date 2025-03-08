package com.wclass.structalgorithm.tree;

// 测试链接：https://leetcode.com/problems/path-sum
public class d9_PathSum {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	// 默认没有
	public static boolean isSum = false;

	/**
	 *
	 * @param root 根节点
	 * @param sum 目标和
	 * @return
	 */
	public static boolean hasPathSum(TreeNode root, int sum) {
		// 根节点为null，直接结束
		if (root == null) {
			return false;
		}
		isSum = false;
		process(root, 0, sum);
		// 返回
		return isSum;
	}

	/**
	 *
	 * @param x 树节点
	 * @param preSum 前缀和
	 * @param sum 目标和
	 */
	public static void process(TreeNode x, int preSum, int sum) {
		// 左右孩子为null情况，到叶子节点的时候，进行一次判断
		if (x.left == null && x.right == null) {
			// 当前值与前缀和之和等于sum，说明存在
			if (x.val + preSum == sum) {
				isSum = true;
			}
			return;
		}
		// x是非叶节点
		preSum += x.val;
		// 左不为null，递归
		if (x.left != null) {
			process(x.left, preSum, sum);
		}
		// 右不为null，递归
		if (x.right != null) {
			process(x.right, preSum, sum);
		}
	}

}
