package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d16_nearest_common_ancestor_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName PathComparisonS6D16
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-36
 * @Version 1.0
 **/
public class PathComparisonS6D16 {

    //记录是否找到到o的路径
    public boolean flag = false;
    //求得根节点到目标节点的路径
    public void dfs(TreeNode root, ArrayList<Integer> path, int o){
        if(flag || root == null)
            return;
        path.add(root.val);
        //节点值都不同，可以直接用值比较
        if(root.val == o){
            flag = true;
            return;
        }
        //dfs遍历查找
        dfs(root.left, path, o);
        dfs(root.right, path, o);
        //找到
        if(flag)
            return;
        //回溯
        path.remove(path.size() - 1);
    }
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        ArrayList<Integer> path1 = new ArrayList<Integer>();
        ArrayList<Integer> path2 = new ArrayList<Integer>();
        //求根节点到两个节点的路径
        dfs(root, path1, o1);
        //重置flag，查找下一个
        flag = false;
        dfs(root, path2, o2);
        int res = 0;
        //比较两个路径，找到第一个不同的点
        for(int i = 0; i < path1.size() && i < path2.size(); i++){
            int x = path1.get(i);
            int y = path2.get(i);
            if(x == y)
                //最后一个相同的节点就是最近公共祖先
                res = x;
            else
                break;
        }
        return res;
    }

}
