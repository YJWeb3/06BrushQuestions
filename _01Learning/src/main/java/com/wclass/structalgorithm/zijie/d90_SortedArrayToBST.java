package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d90_SortedArrayToBST
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/18 0:44
 * @Author:NieZheng
 * @Version:1.0
 */
public class d90_SortedArrayToBST {

    public class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }


    public TreeNode recursion(int[] array,int lhs,int rhs,TreeNode root){
        if (lhs <= rhs){
            int mid = (lhs + rhs + 1) >> 1;
            root = new TreeNode(array[mid-1]);
            root.left = recursion(array,lhs,mid - 1,root.left);
            root.right = recursion(array,mid + 1,rhs,root.right);
        }
        return root;
    }
}
