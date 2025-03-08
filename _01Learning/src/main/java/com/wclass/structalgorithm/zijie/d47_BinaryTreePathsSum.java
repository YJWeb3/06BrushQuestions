package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d47_BinaryTreePathsSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 11:12
 * @Author:NieZheng
 * @Version:1.0
 */
public class d47_BinaryTreePathsSum {

    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> binaryTreePathsSum(TreeNode root,int target){
        // 初始化结果集
        List<List<Integer>> ans = new ArrayList<>();

        // 开始递归，将结果集和当前的集合传入dfs里面
        dfs(root,target,ans,new ArrayList());
        return ans;
    }

    private void dfs(TreeNode root, int remain, List<List<Integer>> ans, List<Integer> curr) {
        // 如果遍历到了叶子节点下面的空节点，返回
        if (root == null) return;

        // 如果剩余的值恰好等于node的值，并且此node是叶子节点，则找到了符合的一条路径
        // 将其添加到结果集里面，并且要回溯，将其还原成原来的样子
        if (remain == root.val){
            if (root.left == null && root.right == null){
                curr.add(root.val);
                ans.add(new ArrayList<>(curr));
                // 回溯
                curr.remove(curr.size() - 1);
                return;
            }
        }
        curr.add(root.val);
        dfs(root.left,remain - root.val,ans,curr);
        dfs(root.right,remain - root.val,ans,curr);
        // 回溯
        curr.remove(curr.size() - 1);
    }

}
