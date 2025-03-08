package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d10_determine_two_strings_close;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D10
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-17
 * @Version 1.0
 **/
public class HashTableS9D10 {

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        int[] time1 = new int[26];
        int[] time2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            time1[word1.charAt(i) - 'a']++;
            time2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((time1[i] > 0 && time2[i] == 0)
                    || (time2[i] > 0 && time1[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(time1);
        Arrays.sort(time2);

        for (int i = 0; i < 26; i++) {
            if (time1[i] != time2[i]) {
                return false;
            }
        }

        return true;

    }

}
