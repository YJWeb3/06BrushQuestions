package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d1_effective_bracket_sequence;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StacklS5D1
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-21
 * @Version 1.0
 **/
public class StacklS5D1 {

    public boolean isValid (String s) {
        //辅助栈
        Stack<Character> st = new Stack<Character>();
        //遍历字符串
        for(int i = 0; i < s.length(); i++){
            //遇到左小括号
            if(s.charAt(i) == '(')
                //期待遇到右小括号
                st.push(')');
                //遇到左中括号
            else if(s.charAt(i) == '[')
                //期待遇到右中括号
                st.push(']');
                //遇到左打括号
            else if(s.charAt(i) == '{')
                //期待遇到右打括号
                st.push('}');
                //必须有左括号的情况下才能遇到右括号
            else if(st.isEmpty() || st.pop() != s.charAt(i))
                return false;
        }
        //栈中是否还有元素
        return st.isEmpty();
    }

}
