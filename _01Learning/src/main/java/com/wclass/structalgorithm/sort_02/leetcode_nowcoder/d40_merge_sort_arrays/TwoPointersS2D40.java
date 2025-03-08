package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d40_merge_sort_arrays;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D40
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-23
 * @Version 1.0
 **/
public class TwoPointersS2D40 {

    public void merge(int A[], int m, int B[], int n) {
        //指向数组A的结尾
        int i = m - 1;
        //指向数组B的结尾
        int j = n - 1;
        //指向数组A空间的结尾处
        int k = m + n - 1;
        //从两个数组最大的元素开始，直到某一个数组遍历完
        while(i >= 0 && j >= 0){
            //将较大的元素放到最后
            if(A[i] > B[j])
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        //数组A遍历完了，数组B还有，则还需要添加到数组A前面
        if(i < 0){
            while(j >= 0)
                A[k--] = B[j--];
        }
        //数组B遍历完了，数组A前面正好有，不用再添加
    }

}
