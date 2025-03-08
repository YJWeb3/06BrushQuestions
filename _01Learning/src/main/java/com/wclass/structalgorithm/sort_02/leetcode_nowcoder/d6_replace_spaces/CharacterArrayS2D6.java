package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d6_replace_spaces;

/**
 * @program: StructAlgorithm
 * @ClassName CharacterArrayS1D6
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-08
 * @Version 1.0
 **/
public class CharacterArrayS2D6 {

    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }

}
