package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d27_all_anagrams_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName SlidingWindowS1D27
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-23
 * @Version 1.0
 **/
public class SlidingWindowS2D27 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

}
