package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d3_post_order_traversal;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursionS6D3
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-50
 * @Version 1.0
 **/
public class NoRecursionS6D3 {

    public int[] postorderTraversal (TreeNode root) {
        //添加遍历结果的数组
        List<Integer> list = new ArrayList();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode pre = null;
        while(root != null || !s.isEmpty()){
            //每次先找到最左边的节点
            while(root != null){
                s.push(root);
                root = root.left;
            }
            //弹出栈顶
            TreeNode node = s.pop();
            //如果该元素的右边没有或是已经访问过
            if(node.right == null || node.right == pre){
                //访问中间的节点
                list.add(node.val);
                //且记录为访问过了
                pre = node;
            }else{
                //该节点入栈
                s.push(node);
                //先访问右边
                root = node.right;
            }
        }
        //返回的结果
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

}
