package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d40_max_intra_layer_elements_sum;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS6D40
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-33
 * @Version 1.0
 **/
public class BFSS6D40 {

    public int maxLevelSum(TreeNode root) {
        int ans = 1, maxSum = root.val;
        List<TreeNode> q = new ArrayList<TreeNode>();
        q.add(root);
        for (int level = 1; !q.isEmpty(); ++level) {
            List<TreeNode> nq = new ArrayList<TreeNode>();
            int sum = 0;
            for (TreeNode node : q) {
                sum += node.val;
                if (node.left != null) {
                    nq.add(node.left);
                }
                if (node.right != null) {
                    nq.add(node.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
            q = nq;
        }
        return ans;
    }

}
