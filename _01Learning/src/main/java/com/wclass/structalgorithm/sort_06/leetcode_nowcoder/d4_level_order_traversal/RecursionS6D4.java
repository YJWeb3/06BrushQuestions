package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d4_level_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D4
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-54
 * @Version 1.0
 **/
public class RecursionS6D4 {

    //记录输出
    ArrayList<ArrayList<Integer>> res = new ArrayList();
    void traverse(TreeNode root, int depth) {
        if(root != null){
            //新的一层
            if(res.size() < depth){
                ArrayList<Integer> row = new ArrayList();
                res.add(row);
                row.add(root.val);
                //读取该层的一维数组，将元素加入末尾
            }else{
                ArrayList<Integer> row = res.get(depth - 1);
                row.add(root.val);
            }
        }
        else
            return;
        //递归左右时深度记得加1
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        if(root == null)
            //如果是空，则直接返回
            return res;
        //递归层次遍历
        traverse(root, 1);
        return res;
    }

}
