package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d12_determine_binary_search_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName NoStackS6D12
 * @description:
 * @author: W哥
 * @create: 2024-09-26-21-25
 * @Version 1.0
 **/
public class NoStackS6D12 {

    public boolean isValidBST(TreeNode root){
        //设置栈用于遍历
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode head = root;
        //记录中序遍历的数组
        ArrayList<Integer> sort = new ArrayList<Integer>();
        while(head != null || !s.isEmpty()){
            //直到没有左节点
            while(head != null){
                s.push(head);
                head = head.left;
            }
            head = s.pop();
            //访问节点
            sort.add(head.val);
            //进入右边
            head = head.right;
        }
        //遍历中序结果
        for(int i = 1; i < sort.size(); i++){
            //一旦有降序，则不是搜索树
            if(sort.get(i - 1) > sort.get(i))
                return false;
        }
        return true;
    }

}
