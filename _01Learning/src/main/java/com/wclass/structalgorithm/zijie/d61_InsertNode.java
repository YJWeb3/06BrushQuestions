package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d61_InsertNode
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 13:57
 * @Author:NieZheng
 * @Version:1.0
 */
public class d61_InsertNode {

    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    // 递归方式
    public TreeNode insertNode(TreeNode root,TreeNode node){
        if (root == null){
            return node;
        }
        if (root.val > node.val){
            root.left = insertNode(root.left,node);
        }else{
            root.right = insertNode(root.right,node);
        }
        return root;
    }

    // 非递归方式
    public TreeNode insertNode2(TreeNode root,TreeNode node){
        if (root == null){
            return node;
        }
        TreeNode cur = root;
        while(cur != null){
            if (node.val < cur.val){
                if (cur.left == null){
                    cur.left = node;
                    break;
                }else {
                    cur = cur.left;
                }
            }else {
                if (cur.right == null){
                    cur.right = node;
                    break;
                }else {
                    cur = cur.right;
                }
            }
        }
        return root;
    }

}
