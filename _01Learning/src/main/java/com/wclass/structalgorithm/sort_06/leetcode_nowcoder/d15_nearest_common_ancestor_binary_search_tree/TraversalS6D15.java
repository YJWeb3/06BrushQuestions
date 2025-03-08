package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d15_nearest_common_ancestor_binary_search_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName TraversalS6D15
 * @description:
 * @author: W哥
 * @create: 2024-09-26-22-18
 * @Version 1.0
 **/
public class TraversalS6D15 {

    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        //空树找不到公共祖先
        if(root == null)
            return -1;
        //pq在该节点两边说明这就是最近公共祖先
        if((p >= root.val && q <= root.val) || (p <= root.val && q >= root.val))
            return root.val;
            //pq都在该节点的左边
        else if(p <= root.val && q <= root.val)
            //进入左子树
            return lowestCommonAncestor(root.left, p, q);
            //pq都在该节点的右边
        else
            //进入右子树
            return lowestCommonAncestor(root.right, p, q);
    }

}
