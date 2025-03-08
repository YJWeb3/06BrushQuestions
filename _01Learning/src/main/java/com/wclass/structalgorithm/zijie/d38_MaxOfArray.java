package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d38_MaxOfArray
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:44
 * @Author:NieZheng
 * @Version:1.0
 */
public class d38_MaxOfArray {

    public float maxOfArray(float[] a){
        float max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public float maxOfArray1(float[] a){
        Arrays.sort(a);
        return a[a.length-1];
    }

}
