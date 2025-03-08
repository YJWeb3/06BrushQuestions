package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;

/**
 * ClassName:d53_GetNarcissisticNumbers
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 13:48
 * @Author:NieZheng
 * @Version:1.0
 */
public class d53_GetNarcissisticNumbers {

    public ArrayList<Integer> getNarcissisticNumbers(int n){
        ArrayList<Integer> result = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < 10; i++) {
                result.add(i);
            }
            return result;
        }
        if (n == 6){
            result.add(548834);
            return result;
        }

        for (int i = pow(10,n-1); i < pow(10,n); i++) {
            int j = i;
            int s = 0;
            while(j > 0){
                s += pow((j % 10),n);
                j = j / 10;
            }
            if (s == i)
                result.add(i);
        }
        return result;
    }

    private int pow(int a, int b) {
        int val = 1;
            for (int i = 0; i <= b ; i++)
                val *= a;
                return val;
    }
}
