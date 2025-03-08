package com.wclass.structalgorithm.sort_15_simulation.leetcode_nowcoder.d3_rotate_matrix_clockwise;

/**
 * @program: StructAlgorithm
 * @ClassName InvertedFlipS15D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-19
 * @Version 1.0
 **/
public class InvertedFlipS15D3 {

    public int[][] rotateMatrix(int[][] mat, int n) {
        int length = mat.length;
        //矩阵转置
        for(int i = 0; i < length; ++i){
            for(int j = 0; j < i; ++j){
                //交换上三角与下三角对应的元素
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //每行翻转
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][length - j - 1];
                mat[i][length - j - 1] = temp;
            }
        }
        return mat;
    }

}
