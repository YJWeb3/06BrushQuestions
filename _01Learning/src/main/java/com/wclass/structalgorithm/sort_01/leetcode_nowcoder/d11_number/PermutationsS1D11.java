package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d11_number;

/**
 * @program: StructAlgorithm
 * @ClassName PermutationsS1D11
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-46
 * @Version 1.0
 **/
public class PermutationsS1D11 {

    int[] res;
    int count = 0;

    public int[] printNumbers(int n) {
        res = new int[(int)Math.pow(10, n) - 1];
        for(int digit = 1; digit < n + 1; digit++){

            for(char first = '1'; first <= '9'; first++){
                char[] num = new char[digit];
                num[0] = first;
                dfs(1, num, digit);
            }
        }
        return res;
    }

    private void dfs(int index, char[] num, int digit){
        if(index == digit){
            res[count++] = Integer.parseInt(String.valueOf(num));
            return;
        }
        for(char i = '0'; i <= '9'; i++){
            num[index] = i;
            dfs(index + 1, num, digit);
        }
    }

}
