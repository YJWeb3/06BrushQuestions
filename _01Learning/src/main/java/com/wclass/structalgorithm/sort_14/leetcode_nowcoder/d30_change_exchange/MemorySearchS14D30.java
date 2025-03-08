package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d30_change_exchange;

/**
 * @program: StructAlgorithm
 * @ClassName MemorySearchS14D30
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-59
 * @Version 1.0
 **/
public class MemorySearchS14D30 {

    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        return coinChange(coins, amount, new int[amount]);
    }

    private int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

}
