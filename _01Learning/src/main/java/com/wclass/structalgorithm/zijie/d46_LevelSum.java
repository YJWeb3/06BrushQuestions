package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d46_LevelSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/8 16:40
 * @Author:NieZheng
 * @Version:1.0
 */
public class d46_LevelSum {

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

    public int levelSum(TreeNode root,int level){
        helper(root,1,level);
        return sum;
    }

    private void helper(TreeNode root, int depth, int level) {
        if (root == null){
            return;
        }
        if (depth == level){
            sum += root.val;
            return;
        }

        helper(root.left,depth + 1,level);
        helper(root.right,depth + 1,level);
    }

}
