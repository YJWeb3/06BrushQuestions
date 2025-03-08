package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d6_number_digits_one;

/**
 * @program: StructAlgorithm
 * @ClassName ListNumberOneEachDigitS17D6
 * @description:
 * @author: W哥
 * @create: 2024-10-09-09-23
 * @Version 1.0
 **/
public class ListNumberOneEachDigitS17D6 {

    public int countDigitOne(int n) {
        // mulk 表示 10^k
        // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
        // 但为了让代码看起来更加直观，这里保留了 k
        long mulk = 1;
        int ans = 0;
        for (int k = 0; n >= mulk; ++k) {
            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
            mulk *= 10;
        }
        return ans;
    }

}
