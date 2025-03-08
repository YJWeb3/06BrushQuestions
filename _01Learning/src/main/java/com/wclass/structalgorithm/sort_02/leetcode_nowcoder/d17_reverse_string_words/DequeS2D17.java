package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d17_reverse_string_words;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName DequeS2D17
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-47
 * @Version 1.0
 **/
public class DequeS2D17 {

    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        Deque<String> d = new ArrayDeque<String>();
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {
                // 将单词 push 到队列的头部
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }

}
