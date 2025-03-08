package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d39_decrypt_numbers;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D39
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-25
 * @Version 1.0
 **/
public class DynamicProgrammingS14D39 {

    public int crackNumber(int ciphertext) {
        String src = String.valueOf(ciphertext);
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < src.length(); ++i) {
            p = q;
            q = r;
            r = 0;
            r += q;
            if (i == 0) {
                continue;
            }
            String pre = src.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                r += p;
            }
        }
        return r;
    }

}

