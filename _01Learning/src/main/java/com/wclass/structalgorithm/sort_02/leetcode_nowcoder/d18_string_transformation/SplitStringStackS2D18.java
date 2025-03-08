package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d18_string_transformation;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName SplitStringStack
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-50
 * @Version 1.0
 **/
public class SplitStringStackS2D18 {

    public String trans(String s, int n) {
        if(n==0)
            return s;
        StringBuffer res=new StringBuffer();
        for (int i = 0; i < n; i++){
            //大小写转换
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')
                res.append((char)(s.charAt(i) - 'A' + 'a'));
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                res.append((char)(s.charAt(i) - 'a' + 'A'));
            else
                //空格直接复制
                res.append((char)(s.charAt(i)));
        }
        Stack<String> temp=new Stack<String>();
        for (int i = 0; i < n; i++){
            int j = i;
            //以空格为界，分割单词
            while(j < n && res.charAt(j) != ' ')
                j++;
            //单词进栈
            temp.push((String)(res.substring(i, j)));
            i = j;
        }
        //排除结尾空格的特殊情况
        if(s.charAt(n - 1) == ' ')
            res = new StringBuffer(" ");
        else
            res = new StringBuffer();
        //栈遵循先进后厨，单词顺序是反的
        while(!temp.empty()){
            res.append(temp.peek());
            temp.pop();
            if(!temp.empty())
                res.append(" ");
        }
        return res.toString();
    }

}
