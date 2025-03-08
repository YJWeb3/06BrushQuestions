package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d18_longest_valid_parentheses;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS14D18
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-27
 * @Version 1.0
 **/
public class StackS14D18 {

    public int longestValidParentheses (String s) {
        int res = 0;
        //记录上一次连续括号结束的位置
        int start = -1;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++){
            //左括号入栈
            if(s.charAt(i) == '(')
                st.push(i);
                //右括号
            else{
                //如果右括号时栈为空，不合法，设置为结束位置
                if(st.isEmpty())
                    start = i;
                else{
                    //弹出左括号
                    st.pop();
                    //栈中还有左括号，说明右括号不够，减去栈顶位置就是长度
                    if(!st.empty())
                        res = Math.max(res, i - st.peek());
                        //栈中没有括号，说明左右括号行号，减去上一次结束的位置就是长度
                    else
                        res = Math.max(res, i - start);
                }
            }
        }
        return res;
    }

}
