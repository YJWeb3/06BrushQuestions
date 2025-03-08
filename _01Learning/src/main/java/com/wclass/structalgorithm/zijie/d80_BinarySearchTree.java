package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d80_BinarySearchTree
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 12:44
 * @Author:NieZheng
 * @Version:1.0
 */

class TreeNode{
    public int val;
    public TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}

class ResultType{
    public boolean isBalanced;
    public int maxDepth;
    public ResultType(boolean isBalanced,int maxDepth){
        this.isBalanced = isBalanced;
        this.maxDepth = maxDepth;
    }
}
public class d80_BinarySearchTree {

    public boolean isBalanced(TreeNode root){
        return helper(root).isBalanced;
    }

    private ResultType helper(TreeNode root) {
        if (root == null){
            return new ResultType(true,0);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        if (!left.isBalanced || !right.isBalanced){
            return new ResultType(false,-1);
        }

        if (Math.abs(left.maxDepth - right.maxDepth) > 1){
            return new ResultType(false,-1);
        }

        return new ResultType(true, Math.max(left.maxDepth,right.maxDepth) + 1);
    }


    public boolean isBalanced2(TreeNode root){
        return maxDepth(root) != - 1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left == -1 || right == -1 || Math.abs(left-right) > 1){
            return -1;
        }
        return Math.max(left,right) + 1;
    }
}
