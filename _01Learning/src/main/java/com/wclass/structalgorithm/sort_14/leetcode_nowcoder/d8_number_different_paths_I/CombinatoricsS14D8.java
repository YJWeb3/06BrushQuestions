package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d8_number_different_paths_I;

/**
 * @program: StructAlgorithm
 * @ClassName CombinatoricsS14D8
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-52
 * @Version 1.0
 **/
public class CombinatoricsS14D8 {

    public int uniquePaths (int m, int n) {
        //防止溢出
        long res = 1;
        for(int i = 1; i < n; i++)
            //根据公式计算
            res = res * (m + i - 1) / i;
        return (int)res;
    }

}
