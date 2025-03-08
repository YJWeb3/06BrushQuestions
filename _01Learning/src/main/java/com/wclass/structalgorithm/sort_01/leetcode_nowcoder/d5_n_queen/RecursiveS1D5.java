package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d5_n_queen;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveS1D5
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-46
 * @Version 1.0
 **/
public class RecursiveS1D5 {
    private int res;
    //判断皇后是否符合条件
    public boolean isValid(int[] pos, int row, int col){
        //遍历所有已经记录的行
        for(int i = 0; i < row; i++){
            //不能同行同列同一斜线
            if(row == i || col == pos[i] || Math.abs(row - i) == Math.abs(col - pos[i]))
                return false;
        }
        return true;
    }

    //递归查找皇后种类
    public void recursion(int n, int row, int[] pos){
        //完成全部行都选择了位置
        if(row == n){
            res++;
            return;
        }
        //遍历所有列
        for(int i = 0; i < n; i++){
            //检查该位置是否符合条件
            if(isValid(pos, row, i)){
                //加入位置
                pos[row] = i;
                //递归继续查找
                recursion(n, row + 1, pos);
            }
        }
    }
    public int Nqueen (int n) {
        res = 0;
        //下标为行号，元素为列号，记录皇后位置
        int[] pos = new int[n];
        Arrays.fill(pos, 0);
        //递归
        recursion(n, 0, pos);
        return res;
    }
}
