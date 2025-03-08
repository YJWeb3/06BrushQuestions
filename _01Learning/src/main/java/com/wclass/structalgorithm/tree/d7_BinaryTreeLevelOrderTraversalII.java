package com.wclass.structalgorithm.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 测试链接：https://leetcode.com/problems/binary-tree-level-order-traversal-ii
public class d7_BinaryTreeLevelOrderTraversalII {

	// 普通的二叉树结构
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		// 准备一个大列表存储小列表
		List<List<Integer>> ans = new LinkedList<>();
		if (root == null) {
			return ans;
		}
		// 准备一个队列
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		// 队列不为空
		while (!queue.isEmpty()) {
			int size = queue.size();
			// 准备一个小列表
			List<Integer> curAns = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode curNode = queue.poll();
				curAns.add(curNode.val);
				if (curNode.left != null) {
					queue.add(curNode.left);
				}
				if (curNode.right != null) {
					queue.add(curNode.right);
				}
			}
			// 每次放队头去
			ans.add(0, curAns);
		}
		return ans;
	}

}
