package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d11_greatest_common_divisor;

/**
 * @program: StructAlgorithm
 * @ClassName EnumerationS1D11
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-20
 * @Version 1.0
 **/
public class EnumerationS2D11 {

    // 字符串最大公因子
    public String gcdOfStrings(String str1, String str2) {
        // 获取两个字符串长度
        int len1 = str1.length(), len2 = str2.length();
        // 从长度小的开始枚举
        for (int i = Math.min(len1, len2); i >= 1; --i) {
            // 前缀串的长度必然是两个字符串长度的约数才能满足条件
            if (len1 % i == 0 && len2 % i == 0) {
                // 截取子串
                String X = str1.substring(0, i);
                // 检测子串是否能被两个字符串整除
                if (check(X, str1) && check(X, str2)) {
                    return X;
                }
            }
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

}
