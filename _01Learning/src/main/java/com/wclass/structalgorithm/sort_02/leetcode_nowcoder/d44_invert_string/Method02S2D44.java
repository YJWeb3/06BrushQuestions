package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d44_invert_string;

/**
 * @program: StructAlgorithm
 * @ClassName Method02S2D44
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-01
 * @Version 1.0
 **/
public class Method02S2D44 {

    public String solve (String str) {
        char[] cstr = str.toCharArray();
        int len = str.length();
        for(int i = 0 ; i < len/2 ;i++)
        {
            char t = cstr[i];
            cstr[i] = cstr[len-1-i];
            cstr[len-1-i]=t;
        }
        return new String(cstr);
    }

}
