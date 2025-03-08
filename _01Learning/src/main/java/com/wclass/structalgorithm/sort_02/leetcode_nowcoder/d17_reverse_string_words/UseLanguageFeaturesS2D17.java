package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d17_reverse_string_words;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName UseLanguageFeaturesS2D17
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-44
 * @Version 1.0
 **/
public class UseLanguageFeaturesS2D17 {

    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

}
