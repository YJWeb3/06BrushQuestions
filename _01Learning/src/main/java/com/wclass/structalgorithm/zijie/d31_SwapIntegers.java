package com.wclass.structalgorithm.zijie;/**
*   ClassName:d31_SwapIntegers
*   Package:com.yj.nz
*   Description:描述
*   @Date:2023/2/7 14:46
*   @Author:NieZheng
*   @Version:1.0
*/public class d31_SwapIntegers {

    public void swaoInteger(int[] A,int index1,int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
