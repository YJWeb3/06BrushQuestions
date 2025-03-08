package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d103_SubTree
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/22 14:46
 * @Author:NieZheng
 * @Version:1.0
 */

public class d103_SubTree {
    
    public boolean isSubTree(TreeNode T1,TreeNode T2){
        if (T2 == null){
            return true;
        }
        if (T1 == null){
            return false;
        }
        if (isEqual(T1,T2)){
            return true;
        }
        if (isSubTree(T1.left,T2) || isSubTree(T1.right,T2)){
            return true;
        }
        return false;
    }

    private boolean isEqual(TreeNode T1, TreeNode T2) {
        if (T1 == null || T2 == null){
            return T1 == T2;
        }
        if (T1.val != T2.val){
            return false;
        }
        return isEqual(T1.left,T2.left) && isEqual(T1.right,T2.right);
    }

}
