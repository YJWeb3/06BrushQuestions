package com.wclass.brush.d2_dynamic.d1_base.d6_longest_increasing_subsequence;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo02DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-22
 * @Version 1.0
 **/
public class Demo02DynamicProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            LIS(a);
        }


    }

    public static int LIS(int[] a){
        int[] dp = new int[a.length];
        int[] pre = new int[a.length];
        int max_index = 1;
        int max = 1;
        pre[0] = -1;
        for (int i = 0; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]){
                    if (dp[j] >= dp[i]){
                        dp[i] = dp[j]+1;
                        pre[i] = j;
                    }
                }
            }
            if (dp[i] > max){
                max = dp[i];
                max_index = i;
            }
        }

        Stack<Integer> stack = new Stack<>();
        //递增子序列最长时 最后一个元素为max_index
        int index = max_index;
        while (index >= 0){
            //入栈
            stack.push(a[index]);
            //前一个下标
            index = pre[index];


        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            //一一出栈
            System.out.print(stack.pop()+" ");
        }
        System.out.println();


        return max;
    }

}