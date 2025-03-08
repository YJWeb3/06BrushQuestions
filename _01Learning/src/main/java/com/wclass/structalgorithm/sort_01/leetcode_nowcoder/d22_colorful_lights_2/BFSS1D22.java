package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d22_colorful_lights_2;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS1D22
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-26
 * @Version 1.0
 **/
public class BFSS1D22 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        if (root != null) d.addLast(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (!d.isEmpty()) {
            int sz = d.size();
            List<Integer> list = new ArrayList<>();
            while (sz-- > 0) {
                TreeNode t = d.pollFirst();
                list.add(t.val);
                if (t.left != null) d.addLast(t.left);
                if (t.right != null) d.addLast(t.right);
            }
            ans.add(list);
        }
        return ans;
    }

}
