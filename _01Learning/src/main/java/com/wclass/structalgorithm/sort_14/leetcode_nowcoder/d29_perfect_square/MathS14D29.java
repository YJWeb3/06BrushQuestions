package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d29_perfect_square;

/**
 * @program: StructAlgorithm
 * @ClassName MathS14D29
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-57
 * @Version 1.0
 **/
public class MathS14D29 {

    public int numSquares(int n) {
        if (isPerfectSquare(n)) {
            return 1;
        }
        if (checkAnswer4(n)) {
            return 4;
        }
        for (int i = 1; i * i <= n; i++) {
            int j = n - i * i;
            if (isPerfectSquare(j)) {
                return 2;
            }
        }
        return 3;
    }

    // 判断是否为完全平方数
    public boolean isPerfectSquare(int x) {
        int y = (int) Math.sqrt(x);
        return y * y == x;
    }

    // 判断是否能表示为 4^k*(8m+7)
    public boolean checkAnswer4(int x) {
        while (x % 4 == 0) {
            x /= 4;
        }
        return x % 8 == 7;
    }

}
