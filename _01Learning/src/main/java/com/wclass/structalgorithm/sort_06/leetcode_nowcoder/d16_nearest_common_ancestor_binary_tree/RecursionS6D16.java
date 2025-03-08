package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d16_nearest_common_ancestor_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D16
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-37
 * @Version 1.0
 **/
public class RecursionS6D16 {

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        //该子树没找到，返回-1
        if(root == null)
            return -1;
        //该节点是其中某一个节点
        if(root.val == o1 || root.val == o2)
            return root.val;
        //左子树寻找公共祖先
        int left = lowestCommonAncestor(root.left, o1, o2);
        //右子树寻找公共祖先
        int right = lowestCommonAncestor(root.right, o1, o2);
        //左子树为没找到，则在右子树中
        if(left == -1)
            return right;
        //右子树没找到，则在左子树中
        if(right == -1)
            return left;
        //否则是当前节点
        return root.val;
    }

}
