package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d19_right_side_view_binary_tree;

import com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d0_entity.TreeNode;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveTreeBuildingDepthSearchOptimizationS6D19
 * @description:
 * @author: W哥
 * @create: 2024-09-27-20-44
 * @Version 1.0
 **/
public class RecursiveTreeBuildingDepthSearchOptimizationS6D19 {

    public Map<Integer, Integer> index;
    //建树函数
    //四个int参数分别是前序最左节点下标，前序最右节点下标
    //中序最左节点下标，中序最右节点坐标
    public TreeNode buildTree(int[] xianxu, int l1, int r1, int[] zhongxu, int l2, int r2){
        if(l1 > r1 || l2 > r2)
            return null;
        //前序遍历中的第一个节点就是根节点
        int xianxu_root = l1;
        //在中序遍历中定位根节点
        int zhongxu_root = index.get(xianxu[xianxu_root]);
        TreeNode root = new TreeNode(xianxu[xianxu_root]);
        //得到左子树中的节点数目
        int leftsize = zhongxu_root - l2;
        root.left = buildTree(xianxu, l1 + 1, l1 + leftsize, zhongxu, l2, zhongxu_root - 1);
        root.right = buildTree(xianxu, l1 + leftsize + 1, r1, zhongxu, zhongxu_root + 1, r2);
        return root;
    }
    //层次遍历
    public ArrayList<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            //队列中的大小即是这一层的节点树
            int size = q.size();
            while(size-- != 0){
                TreeNode temp = q.poll();
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                //最右元素
                if(size == 0)
                    res.add(temp.val);
            }
        }
        return res;
    }

    public int[] solve (int[] xianxu, int[] zhongxu) {
        index = new HashMap<Integer, Integer>();
        //空节点
        if(xianxu.length == 0)
            return new int[0];
        //用哈希表标记中序节点在前序中的位置
        for(int i = 0; i < xianxu.length; i++)
            index.put(zhongxu[i], i);
        //建树
        TreeNode root = buildTree(xianxu, 0, xianxu.length - 1, zhongxu, 0, zhongxu.length - 1);
        //获取右视图输出
        ArrayList<Integer> temp = rightSideView(root);
        //转化为数组
        int[] res = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++)
            res[i] = temp.get(i);
        return res;
    }

}
