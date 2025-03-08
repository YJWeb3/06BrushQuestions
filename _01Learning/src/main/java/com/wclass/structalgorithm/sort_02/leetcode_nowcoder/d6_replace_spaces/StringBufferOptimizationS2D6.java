package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d6_replace_spaces;

/**
 * @program: StructAlgorithm
 * @ClassName StringBufferOptimizationS1D6
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-09
 * @Version 1.0
 **/
public class StringBufferOptimizationS2D6 {

    public String replaceSpace(String s) {
        //StringBuffer暂存新串
        //将string每个字符添加到stringbuffer后面，遇到“ ”换成“%20”
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                sb.append("%20");//append(char c) 将char参数的字符串表示附加到此序列。
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
