package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d19_longest_common_prefix;

/**
 * @program: StructAlgorithm
 * @ClassName TraverseSearchS2D19
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-53
 * @Version 1.0
 **/
public class TraverseSearchS2D19 {

    public String longestCommonPrefix (String[] strs) {
        int n = strs.length;
        //空字符串数组
        if(n == 0)
            return "";
        //遍历第一个字符串的长度
        for(int i = 0; i < strs[0].length(); i++){
            char temp = strs[0].charAt(i);
            //遍历后续的字符串
            for(int j = 1; j < n; j++)
                //比较每个字符串该位置是否和第一个相同
                if(i == strs[j].length() || strs[j].charAt(i) != temp)
                    //不相同则结束
                    return strs[0].substring(0, i);
        }
        //后续字符串有整个字一个字符串的前缀
        return strs[0];
    }

}
