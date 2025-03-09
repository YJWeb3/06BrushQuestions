package com.wclass.brush.d2_dynamic.d1_base.d2_longest_common_subsequence;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01ExhaustiveSearch
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-12
 * @Version 1.0
 **/
public class Demo02Memo {

    public static void main(String[] args) {
        //数组从1开始，舍弃0
        char[] x= {' ','A','C','D','E','D','C'};
        char[] y= {' ','A','B','C','D','C'};

        System.out.println(LCS(x, y, x.length-1, y.length-1, new int[x.length][y.length]));

    }

    /**
     *
     * @param x 序列X
     * @param y 序列Y
     * @param i X下标
     * @param j Y下标
     * @param c 备忘录表
     * @return 最长子序列的长度
     */
    public static int LCS(char[] x,char[] y,int i,int j,int[][] c){

        if (i == 0||j == 0){
            return  0;
        }
        if (c[i][j] == 0){
            if (x[i] == y[j]){
                c[i][j] = LCS(x,y,i-1,j-1,c)+1;
            }else {
                c[i][j] = Math.max(LCS(x,y,i-1,j,c),LCS(x,y,i,j-1,c));
            }
        }
        return c[i][j];

    }

}