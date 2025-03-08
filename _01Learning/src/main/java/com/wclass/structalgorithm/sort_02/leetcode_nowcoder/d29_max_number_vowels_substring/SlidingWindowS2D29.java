package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d29_max_number_vowels_substring;

/**
 * @program: StructAlgorithm
 * @ClassName SlidingWindowS1D29
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-27
 * @Version 1.0
 **/
public class SlidingWindowS2D29 {

    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowel_count = 0;
        for (int i = 0; i < k; ++i) {
            vowel_count += isVowel(s.charAt(i));
        }
        int ans = vowel_count;
        for (int i = k; i < n; ++i) {
            vowel_count += isVowel(s.charAt(i)) - isVowel(s.charAt(i - k));
            ans = Math.max(ans, vowel_count);
        }
        return ans;
    }

    public int isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }

}
