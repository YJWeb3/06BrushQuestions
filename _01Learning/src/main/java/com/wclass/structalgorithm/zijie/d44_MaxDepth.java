package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d44_MaxDepth
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/8 16:14
 * @Author:NieZheng
 * @Version:1.0
 */
public class d44_MaxDepth {

    private int depth;


    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }

    public int maxDepth2(TreeNode root){
        depth = 0;
        helper(root,1);

        return depth;
    }

    private void helper(TreeNode node, int curDepth) {
        if (node == null){
            return;
        }
        if (curDepth > depth){
            depth = curDepth;
        }

        helper(node.left,curDepth + 1);
        helper(node.right,curDepth + 1);
    }
}
