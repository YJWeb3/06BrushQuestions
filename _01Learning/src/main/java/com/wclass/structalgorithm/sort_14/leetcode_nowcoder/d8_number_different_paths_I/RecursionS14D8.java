package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d8_number_different_paths_I;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS14D8
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-52
 * @Version 1.0
 **/
public class RecursionS14D8 {

    public int uniquePaths (int m, int n) {
        //矩阵只要有一条边为1，路径数就只有一种了
        if(m == 1 || n == 1)
            return 1;
        //两个分支
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

}
