package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d10_postorder_traversal_tree;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName AuxiliaryMonotonicStack
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-58
 * @Version 1.0
 **/
public class AuxiliaryMonotonicStackS1D10 {

    public boolean verifyTreeOrder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root) return false;
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }

}
