package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d35_longest_valid_parentheses‌;

/**
 * @program: StructAlgorithm
 * @ClassName NoAdditionalSpaceS14D35
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-18
 * @Version 1.0
 **/
public class NoAdditionalSpaceS14D35 {

    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return maxlength;
    }

}
