package com.wclass.structalgorithm.zijie;


/**
 * ClassName:d45_MinDepth
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/8 16:23
 * @Author:NieZheng
 * @Version:1.0
 */
public class d45_MinDepth {

    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public int minDept(TreeNode root){
        if (root == null){
            return 0;
        }
        return getMin(root);
    }

    private int getMin(TreeNode root) {
        if (root == null){
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null){
            return 1;
        }
        return Math.min(getMin(root.left),getMin(root.right)) + 1;
    }
}
