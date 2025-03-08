package com.wclass.structalgorithm.zijie;

import java.util.Stack;

/**
 * ClassName:d96_DeleteChar
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/19 20:10
 * @Author:NieZheng
 * @Version:1.0
 */
public class d96_DeleteChar {

    public String deletChar(String str,int k){
        if (str == null || str.length() < 1){
            return "";
        }
        int n = str.length();
        if (n <= k){
            return str;
        }
        char[] arr = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int j = n - k;
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && j >0 && arr[i] < arr[stack.peek()]){
                stack.pop();
                j--;
            }
            stack.push(i);
        }
        for (int i = 0; i < j; i++) {
            stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(arr[stack.pop()]);
        }
        return sb.reverse().toString();
    }
}
