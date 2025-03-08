package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d10_postorder_traversal_tree;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveS1D10
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-57
 * @Version 1.0
 **/
public class RecursivePartitionS1D10 {

    public boolean verifyTreeOrder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}
