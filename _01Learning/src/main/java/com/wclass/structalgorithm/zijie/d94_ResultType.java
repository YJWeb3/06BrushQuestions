package com.wclass.structalgorithm.zijie;


/**
 * ClassName:d94_ResultType
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/19 19:21
 * @Author:NieZheng
 * @Version:1.0
 */
public class d94_ResultType {

    class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    private class ResultType{
        // singlePath：从root往下走到任意点的最大路径，这条路径可以不包含任何点
        // maxPath：从树中任意到任意点的最大路径，这条路径至少包含一个点
        int singlePath,maxPath;
        ResultType(int singlePath,int maxPath){
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }

    private ResultType helper(TreeNode root){
        if (root == null){
            return new ResultType(0,Integer.MIN_VALUE);
        }
        // Divide
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        // Conquer
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        singlePath = Math.max(singlePath,0);

        int maxPath = Math.max(left.maxPath,right.maxPath);
        maxPath = Math.max(maxPath,left.singlePath + right.singlePath + root.val);

        return new ResultType(singlePath,maxPath);
    }

    public int maxPathSum(TreeNode root){
        ResultType result = helper(root);
        return result.maxPath;
    }
}
