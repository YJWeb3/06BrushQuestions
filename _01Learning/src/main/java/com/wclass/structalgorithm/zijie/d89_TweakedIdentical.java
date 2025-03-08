package com.wclass.structalgorithm.zijie;


/**
 * ClassName:d89_TweakIdentical
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/18 0:30
 * @Author:NieZheng
 * @Version:1.0
 */


public class d89_TweakedIdentical {

    public class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public boolean isTweakedIdentical(TreeNode a,TreeNode b){
        if (a == null && b == null){
            return true;
        }
        if (a == null || b == null){
            return false;
        }
        if (a.val != b.val){
            return false;
        }
        if (isTweakedIdentical(a.left,b.left) && isTweakedIdentical(a.right,b.right)){
            return true;
        }
        if (isTweakedIdentical(a.left,b.right) && isTweakedIdentical(a.right,b.left)){
            return true;
        }

        return false;
    }

}
