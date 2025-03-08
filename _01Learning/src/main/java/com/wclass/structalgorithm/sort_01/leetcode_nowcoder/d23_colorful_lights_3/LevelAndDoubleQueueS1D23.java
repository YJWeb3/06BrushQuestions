package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d23_colorful_lights_3;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName LevelAndDoubleQueue
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-28
 * @Version 1.0
 **/
public class LevelAndDoubleQueueS1D23 {

    public List<List<Integer>> decorateRecord(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0) tmp.addLast(node.val);
                else tmp.addFirst(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

}
