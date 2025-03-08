package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d109_CoinChange
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/25 17:13
 * @Author:NieZheng
 * @Version:1.0
 */
public class d109_CoinChange {

    public int coinChange(int[] A,int M){
        int[] f = new int[M + 1];
        int n = A.length;

        f[0] = 0;
        int i,j;
        for (i = 1; i <= M; ++i) {
            f[i] = -1;
            for (j = 0;j < n;++j){
                if (i >= A[j] && f[i - A[j]] != -1){
                    if (f[i] == -1 || f[i - A[j]] + 1 < f[i]){
                        f[i] = f[i - A[j]] + 1;
                    }
                }
            }
        }
        return f[M];
    }
}
