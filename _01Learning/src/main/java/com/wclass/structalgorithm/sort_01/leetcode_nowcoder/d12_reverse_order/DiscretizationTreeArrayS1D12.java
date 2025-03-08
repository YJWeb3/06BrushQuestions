package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d12_reverse_order;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DiscretizationTreeArrayS1D12
 * @description:
 * @author: W哥
 * @create: 2024-09-09-21-49
 * @Version 1.0
 **/
public class DiscretizationTreeArrayS1D12 {

    public int reversePairs(int[] record) {
        int n = record.length;
        int[] tmp = new int[n];
        System.arraycopy(record, 0, tmp, 0, n);
        // 离散化
        Arrays.sort(tmp);
        for (int i = 0; i < n; ++i) {
            record[i] = Arrays.binarySearch(tmp, record[i]) + 1;
        }
        // 树状数组统计逆序对
        BIT bit = new BIT(n);
        int ans = 0;
        for (int i = n - 1; i >= 0; --i) {
            ans += bit.query(record[i] - 1);
            bit.update(record[i]);
        }
        return ans;
    }
}

class BIT {
    private int[] tree;
    private int n;

    public BIT(int n) {
        this.n = n;
        this.tree = new int[n + 1];
    }

    public static int lowbit(int x) {
        return x & (-x);
    }

    public int query(int x) {
        int ret = 0;
        while (x != 0) {
            ret += tree[x];
            x -= lowbit(x);
        }
        return ret;
    }

    public void update(int x) {
        while (x <= n) {
            ++tree[x];
            x += lowbit(x);
        }
    }
}