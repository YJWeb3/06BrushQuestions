package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d39_longest_zigzag_path_bt;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS6D39
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-30
 * @Version 1.0
 **/
public class DynamicProgrammingS6D39 {

    Map<TreeNode, Integer> f = new HashMap<TreeNode, Integer>();
    Map<TreeNode, Integer> g = new HashMap<TreeNode, Integer>();
    Queue<TreeNode[]> q = new LinkedList<TreeNode[]>();

    public int longestZigZag(TreeNode root) {
        dp(root);
        int maxAns = 0;
        for (TreeNode u : f.keySet()) {
            maxAns = Math.max(maxAns, Math.max(f.get(u), g.get(u)));
        }
        return maxAns;
    }

    public void dp(TreeNode o) {
        f.put(o, 0);
        g.put(o, 0);
        q.offer(new TreeNode[]{o, null});
        while (!q.isEmpty()) {
            TreeNode[] y = q.poll();
            TreeNode u = y[0], x = y[1];
            f.put(u, 0);
            g.put(u, 0);
            if (x != null) {
                if (x.left == u) {
                    f.put(u, g.get(x) + 1);
                }
                if (x.right == u) {
                    g.put(u, f.get(x) + 1);
                }
            }
            if (u.left != null) {
                q.offer(new TreeNode[]{u.left, u});
            }
            if (u.right != null) {
                q.offer(new TreeNode[]{u.right, u});
            }
        }
    }

}
