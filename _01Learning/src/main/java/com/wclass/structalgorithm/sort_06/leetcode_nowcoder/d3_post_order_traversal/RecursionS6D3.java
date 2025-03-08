package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d3_post_order_traversal;

import com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS6D3
 * @description:
 * @author: W哥
 * @create: 2024-09-25-20-50
 * @Version 1.0
 **/
public class RecursionS6D3 {

    public void postorder(List<Integer> list, TreeNode root){
        //遇到空节点则返回
        if(root == null)
            return;
        //先去左子树
        postorder(list, root.left);
        //再去右子树
        postorder(list, root.right);
        //最后访问根节点
        list.add(root.val);
    }

    public int[] postorderTraversal (TreeNode root) {
        //添加遍历结果的数组
        List<Integer> list = new ArrayList();
        //递归后序遍历
        postorder(list, root);
        //返回的结果
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

}
