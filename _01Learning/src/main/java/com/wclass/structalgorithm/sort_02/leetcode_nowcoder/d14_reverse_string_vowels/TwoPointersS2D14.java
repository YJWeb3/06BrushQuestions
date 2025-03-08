package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d14_reverse_string_vowels;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D14
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-35
 * @Version 1.0
 **/
public class TwoPointersS2D14 {

    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(arr[i])) {
                ++i;
            }
            while (j > 0 && !isVowel(arr[j])) {
                --j;
            }
            if (i < j) {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
