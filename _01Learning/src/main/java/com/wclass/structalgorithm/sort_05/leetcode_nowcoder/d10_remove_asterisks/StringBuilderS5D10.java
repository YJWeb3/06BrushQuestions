package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d10_remove_asterisks;

/**
 * @program: StructAlgorithm
 * @ClassName StringBuilderS5D10
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-14
 * @Version 1.0
 **/
public class StringBuilderS5D10 {

    public String removeStars(String s) {
        StringBuilder rs = new StringBuilder();
        // 遍历每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                // 尾部移除一位
                rs.deleteCharAt(rs.length() - 1);
            } else {
                rs.append(c);
            }
        }

        return rs.toString();
    }

}
