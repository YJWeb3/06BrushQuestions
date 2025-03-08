package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d32_FiboNacci
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 14:54
 * @Author:NieZheng
 * @Version:1.0
 */
public class d32_FiboNacci {

    public int fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n-  1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public int fibonacci2(int n){
        if (n == 1){
            return 0;
        }

        if (n == 2){
            return 1;
        }

        return fibonacci2(n - 1) + fibonacci2(n -2);
    }
}
