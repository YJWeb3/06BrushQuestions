package com.wclass.brush.d2_dynamic.d1_base.d6_longest_increasing_subsequence;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-22
 * @Version 1.0
 **/
public class Demo01DynamicProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //多组测试
        while (scanner.hasNextInt()){
            //序列长度
            int n = scanner.nextInt();
            //序列
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(LIS(a));
        }
    }

    public static int LIS(int[] a){
        int[] dp = new int[a.length];
        int max = 1;
        for (int i = 0; i < a.length; i++) {
            //初始化为 1
            dp[i] = 1;
            //以 i结尾，最长递增序列长度
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]){
                    if (dp[j] >= dp[i]){
                        dp[i] = dp[j]+1;
                    }
                }
            }
            if (dp[i] > max){
                max = dp[i];
            }
        }


        return max;
    }

}