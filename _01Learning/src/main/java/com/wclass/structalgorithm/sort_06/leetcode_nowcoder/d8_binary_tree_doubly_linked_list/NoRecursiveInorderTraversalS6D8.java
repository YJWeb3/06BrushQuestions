package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d8_binary_tree_doubly_linked_list;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoRecursiveInorderTraversalS6D8
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-12
 * @Version 1.0
 **/
public class NoRecursiveInorderTraversalS6D8 {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        //设置栈用于遍历
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode head = null;
        TreeNode pre = null;
        //确认第一个遍历到最左，即为首位
        boolean isFirst = true;
        while(pRootOfTree != null || !s.isEmpty()){
            //直到没有左节点
            while(pRootOfTree != null){
                s.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }
            pRootOfTree = s.pop();
            //最左元素即表头
            if(isFirst){
                head = pRootOfTree;
                pre = head;
                isFirst = false;
                //当前节点与上一节点建立连接，将pre设置为当前值
            }else{
                pre.right = pRootOfTree;
                pRootOfTree.left = pre;
                pre = pRootOfTree;
            }
            pRootOfTree = pRootOfTree.right;
        }
        return head;
    }

}
