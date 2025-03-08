package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d44_invert_string;

/**
 * @program: StructAlgorithm
 * @ClassName Method03S2D44
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-02
 * @Version 1.0
 **/
public class Method03S2D44 {

    public String solve (String str) {
        StringBuffer sb = new StringBuffer(str);//此方法针对的是io流，不能针对字符串。
        return sb.reverse().toString();
    }

}
