package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d18_string_transformation;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleReversalS2D18
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-50
 * @Version 1.0
 **/
public class DoubleReversalS2D18 {

    public String trans(String s, int n) {
        if(n==0)
            return s;
        StringBuffer res=new StringBuffer();
        for(int i = 0; i < n; i++){
            //大小写转换
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')
                res.append((char)(s.charAt(i) - 'A' + 'a'));
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                res.append((char)(s.charAt(i) - 'a' + 'A'));
            else
                //空格直接复制
                res.append(s.charAt(i));
        }
        //翻转整个字符串
        res = res.reverse();
        for (int i = 0; i < n; i++){
            int j = i;
            //以空格为界，二次翻转
            while(j < n && res.charAt(j) != ' ')
                j++;
            String temp = res.substring(i,j);
            StringBuffer buffer = new StringBuffer(temp);
            temp = buffer.reverse().toString();
            res.replace(i,j,temp);
            i = j;
        }
        return res.toString();
    }

}
