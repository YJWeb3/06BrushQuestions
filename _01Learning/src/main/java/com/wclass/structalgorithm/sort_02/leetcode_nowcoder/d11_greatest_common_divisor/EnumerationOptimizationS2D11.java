package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d11_greatest_common_divisor;

/**
 * @program: StructAlgorithm
 * @ClassName EnumerationOptimizationS1D11
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-21
 * @Version 1.0
 **/
public class EnumerationOptimizationS2D11 {

    // 字符串最大公因子
    public String gcdOfStrings(String str1, String str2) {
        // 获取两个字符串长度
        int len1 = str1.length(), len2 = str2.length();
        // 截取子串（截取到最大公因子）
        String T = str1.substring(0, gcd(len1, len2));
        // 检测子串是否能被两个字符串整除
        if (check(T, str1) && check(T, str2)) {
            return T;
        }
        return "";
    }

    public boolean check(String t, String s) {
        int lenx = s.length() / t.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 1; i <= lenx; ++i) {
            ans.append(t);
        }
        return ans.toString().equals(s);
    }

    // 求最大公因子
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
