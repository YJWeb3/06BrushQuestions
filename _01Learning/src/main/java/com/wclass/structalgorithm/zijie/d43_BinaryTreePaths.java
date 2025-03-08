package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d43_BinaryTreePaths
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/8 15:59
 * @Author:NieZheng
 * @Version:1.0
 */
public class d43_BinaryTreePaths {

    public class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root){
        List<String> paths = new ArrayList<>();
        if (root == null){
            return paths;
        }
        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);
        for(String path : leftPaths){
            paths.add(root.val + "->" + path);
        }
        for (String path : rightPaths){
            paths.add(root.val + "->" + path);
        }

        if (paths.size() == 0){
            paths.add("" + root.val);
        }

        return paths;
    }
}
