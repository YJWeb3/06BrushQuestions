package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d1_norepeat;


/**
 * @program: StructAlgorithm
 * @ClassName Main
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-17
 * @Version 1.0
 **/
public class TestS1D1 {

    public static void main(String[] args) {
       int[] initArray =  {1, 2, 3}; // 初始化一个包含5个元素的数组
        sort01(initArray);
    }
    public static void sort01(int[] arr){
        IterationS1D1 noRecursive = new IterationS1D1();
        RecursiveS1D1 recursive = new RecursiveS1D1();

        System.out.println(noRecursive.permute(arr));
        System.out.println(recursive.permute(arr));
    }
}
