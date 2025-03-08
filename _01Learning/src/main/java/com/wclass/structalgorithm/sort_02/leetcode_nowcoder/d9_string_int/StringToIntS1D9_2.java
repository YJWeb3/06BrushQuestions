package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d9_string_int;

/**
 * @program: StructAlgorithm
 * @ClassName StringToIntS1D9_2
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-26
 * @Version 1.0
 **/
public class StringToIntS1D9_2 {

    public int strToInt(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0, sign = 1, length = str.length();
        if(length == 0) return 0;
        while(str.charAt(i) == ' ')
            if(++i == length) return 0;
        if(str.charAt(i) == '-') sign = -1;
        if(str.charAt(i) == '-' || str.charAt(i) == '+') i++;
        for(int j = i; j < length; j++) {
            if(str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if(res > bndry || res == bndry && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign * res;
    }

}
