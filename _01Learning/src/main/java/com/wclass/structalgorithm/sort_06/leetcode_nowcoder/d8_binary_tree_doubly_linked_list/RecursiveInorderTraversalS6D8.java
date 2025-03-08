package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d8_binary_tree_doubly_linked_list;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveInorderTraversalS6D8
 * @description:
 * @author: W哥
 * @create: 2024-09-25-21-12
 * @Version 1.0
 **/
public class RecursiveInorderTraversalS6D8 {

    //返回的第一个指针，即为最小值，先定为null
    public TreeNode head = null;
    //中序遍历当前值的上一位，初值为最小值，先定为null
    public TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            //中序递归，叶子为空则返回
            return null;
        //首先递归到最左最小值
        Convert(pRootOfTree.left);
        //找到最小值，初始化head与pre
        if(pre == null){
            head = pRootOfTree;
            pre = pRootOfTree;
        }
        //当前节点与上一节点建立连接，将pre设置为当前值
        else{
            pre.right = pRootOfTree;
            pRootOfTree.left = pre;
            pre = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return head;
    }

}
