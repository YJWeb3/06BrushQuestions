package com.wclass.structalgorithm.zijie;

/**
 * ClassName:D42_LeafSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/8 15:45
 * @Author:NieZheng
 * @Version:1.0
 */
public class D42_LeafSum {

    private int sum = 0;

    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public int leafSum(TreeNode root){
        helper(root);
        return sum;
    }

    private void helper(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            sum += root.val;
            return;
        }
        helper(root.left);
        helper(root.right);
    }
}
