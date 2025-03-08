package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d23_colorful_lights_3;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName LevelAndReverse
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-34
 * @Version 1.0
 **/
public class LevelAndReverseS1D23 {

    public List<List<Integer>> decorateRecord(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            if(res.size() % 2 == 1) Collections.reverse(tmp);
            res.add(tmp);

        }
        return res;
    }

}
