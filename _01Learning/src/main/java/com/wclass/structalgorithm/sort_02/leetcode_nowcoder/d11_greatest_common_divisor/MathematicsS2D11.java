package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d11_greatest_common_divisor;

/**
 * @program: StructAlgorithm
 * @ClassName MathematicsS2D11
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-23
 * @Version 1.0
 **/
public class MathematicsS2D11 {

    // 字符串最大公因子
    public String gcdOfStrings(String str1, String str2) {
        // 两个字符串相连不相等，直接返回空串
        if (!str1.concat(str2).equals(str2.concat(str1))) {
            return "";
        }
        //
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    // 截取子串（截取到最大公因子）
    public int gcd(int a, int b) {
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }

}
