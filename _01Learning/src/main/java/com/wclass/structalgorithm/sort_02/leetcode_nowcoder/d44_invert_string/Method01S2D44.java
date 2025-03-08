package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d44_invert_string;

/**
 * @program: StructAlgorithm
 * @ClassName MethodS2D44
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-01
 * @Version 1.0
 **/
public class Method01S2D44 {

    public String solve (String str) {
        char[] ans = str.toCharArray();
        int len = str.length();
        for(int i = 0 ; i < len ;i++)
        {
            ans[i] = str.charAt(len-1-i);
        }
        return new String(ans);
    }

}
