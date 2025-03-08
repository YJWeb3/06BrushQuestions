package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d84_AmicablePair
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/17 13:21
 * @Author:NieZheng
 * @Version:1.0
 */
public class d84_AmicablePair {

    public List<List<Integer>> amicablePair(int k){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 2; i <= k; i++) {
            int amicable = factorSum(i);
            if (amicable <= i || amicable > k){
                continue;
            }
            if (factorSum(amicable) == i){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(amicable);
                result.add(pair);
            }
        }
        return result;
    }

    private int factorSum(int n) {
        int sum = 1,i;
        for (i = 2; i * i < n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        if (i * i == n){
            sum += i;
        }
        return sum;
    }

}
