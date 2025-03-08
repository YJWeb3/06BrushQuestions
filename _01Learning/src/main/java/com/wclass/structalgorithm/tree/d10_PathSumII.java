package com.wclass.structalgorithm.tree;

import java.util.ArrayList;
import java.util.List;

// 测试链接：https://leetcode.com/problems/path-sum-ii
public class d10_PathSumII {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	/**
	 *
	 * @param root 根结点
	 * @param sum 目标和
	 * @return 返回大列表
	 */
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		// 准备一个大列表
		List<List<Integer>> ans = new ArrayList<>();
		// 根节点为null，直接返回
		if (root == null) {
			return ans;
		}
		// 小列表
		ArrayList<Integer> path = new ArrayList<>();
		process(root, path, 0, sum, ans);
		return ans;
	}

	/**
	 *
	 * @param x 树节点
	 * @param path 路径
	 * @param preSum 前缀和
	 * @param sum 目标和
	 * @param ans 结果
	 */
	public static void process(TreeNode x, List<Integer> path, int preSum, int sum, List<List<Integer>> ans) {
		// 左右孩子为null情况，到叶子节点的时候，进行一次判断
		if (x.left == null && x.right == null) {
			// 当前值与前缀和之和等于sum，说明存在
			if (preSum + x.val == sum) {
				path.add(x.val);
				// 拷贝路径并添加大列表中
				ans.add(copy(path));
				// 退一步
				path.remove(path.size() - 1);
			}
			return;
		}
		// x 非叶节点
		path.add(x.val);
		preSum += x.val;

		// 左不为null，递归
		if (x.left != null) {
			process(x.left, path, preSum, sum, ans);
		}

		// 右不为null，递归
		if (x.right != null) {
			process(x.right, path, preSum, sum, ans);
		}
		// 退一步
		path.remove(path.size() - 1);
	}

	/**
	 *
	 * @param path 路径
	 * @return
	 */
	public static List<Integer> copy(List<Integer> path) {
		List<Integer> ans = new ArrayList<>();
		for (Integer num : path) {
			ans.add(num);
		}
		return ans;
	}

}
