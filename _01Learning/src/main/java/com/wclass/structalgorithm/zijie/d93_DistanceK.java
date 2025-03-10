package com.wclass.structalgorithm.zijie;


import java.util.*;

/**
 * ClassName:d93_DistanceK
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/19 19:00
 * @Author:NieZheng
 * @Version:1.0
 */
public class d93_DistanceK {

    class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    Map<TreeNode,TreeNode> parent;
    public List<Integer> distanceK(TreeNode root,TreeNode target,int K){
        parent = new HashMap<>();
        dfs(root,null);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(target);

        Set<TreeNode> seen = new HashSet<>();
        seen.add(target);
        seen.add(null);

        int dist = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node == null){
                if (dist == K){
                    List<Integer> ans = new ArrayList<>();
                    for (TreeNode n : queue)
                        ans.add(n.val);
                    return ans;
                }
                queue.offer(null);
                dist++;
            }else {
                if (!seen.contains(node.left)){
                    seen.add(node.left);
                    queue.offer(node.left);
                }
                if (!seen.contains(node.right)){
                    seen.add(node.right);
                    queue.offer(node.right);
                }
                TreeNode par = parent.get(node);
                if (!seen.contains(par)){
                    seen.add(par);
                    queue.offer(par);
                }
            }
        }
        return new ArrayList<>();
    }

    private void dfs(TreeNode node, TreeNode par) {
        if (node != null){
            parent.put(node,par);
            dfs(node.left,node);
            dfs(node.right,node);
        }
    }
}
