package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d11_number;

/**
 * @program: StructAlgorithm
 * @ClassName OrdinaryS1D11
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-45
 * @Version 1.0
 **/
public class OrdinaryS1D11 {
    public int[] printNumbers(int n) {
        int[] res = new int[(int)Math.pow(10, n) - 1];
        for(int i = 0; i < res.length; i++){
            res[i] = i + 1;
        }
        return res;

    }
}
