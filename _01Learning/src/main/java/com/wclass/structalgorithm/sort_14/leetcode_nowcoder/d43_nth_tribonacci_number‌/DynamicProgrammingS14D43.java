package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d43_nth_tribonacci_number‌;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D43
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-13
 * @Version 1.0
 **/
public class DynamicProgrammingS14D43 {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }

}
