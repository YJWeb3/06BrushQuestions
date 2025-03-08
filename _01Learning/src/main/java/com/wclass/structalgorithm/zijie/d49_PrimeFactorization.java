package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d49_PrimeFactorization
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 12:31
 * @Author:NieZheng
 * @Version:1.0
 */
public class d49_PrimeFactorization {

    public List<Integer> primeFactorization(int num){
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                num = num / i;
                factors.add(i);
            }
        }
        if (num != 1){
            factors.add(num);
        }
        return factors;
    }
}
