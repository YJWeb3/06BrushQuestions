package com.wclass.structalgorithm.zijie;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName:d107_SerializeBST
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/23 23:56
 * @Author:NieZheng
 * @Version:1.0
 */


public class d107_SerializeBST {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }

    public String serialize(TreeNode root){
        if (root == null){
            return "#";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            TreeNode cur = qu.poll();
            if (cur == null){
                sb.append("#");
            }else {
                sb.append(cur.val);
                qu.offer(cur.left);
                qu.offer(cur.right);
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public TreeNode deserialize(String data){
        data = data.trim();
        if (data.equals("#")){
            return null;
        }

        String[] nodeVal = data.split("\\s+");
        Deque<TreeNode> qu = new ArrayDeque<>();
        TreeNode head = new TreeNode(Integer.parseInt(nodeVal[0]));
        qu.offer(head);
        int idx = 1;
        while(idx < nodeVal.length){
            TreeNode cur = qu.poll();
            if (nodeVal[idx].equals("#")){
                cur.left = null;
                idx++;
            }else {
                cur.left = new TreeNode(Integer.parseInt(nodeVal[idx++]));
                qu.offer(cur.left);
            }

            if (nodeVal[idx].equals("#")){
                cur.right = null;
                idx++;
            }else {
                cur.right = new TreeNode(Integer.parseInt(nodeVal[idx++]));
                qu.offer(cur.right);
            }
        }
        return head;
    }

}
