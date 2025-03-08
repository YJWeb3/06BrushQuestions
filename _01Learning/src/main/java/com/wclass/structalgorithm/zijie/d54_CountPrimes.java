package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d54_CountPrimes
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 14:13
 * @Author:NieZheng
 * @Version:1.0
 */
public class d54_CountPrimes {
    
    public int countPrimes(int n){
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                counter++;
            }
        }
        return counter;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
