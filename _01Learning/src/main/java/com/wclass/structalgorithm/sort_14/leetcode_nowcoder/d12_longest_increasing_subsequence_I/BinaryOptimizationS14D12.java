package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d12_longest_increasing_subsequence_I;

/**
 * @program: StructAlgorithm
 * @ClassName BinaryOptimizationS14D12
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-07
 * @Version 1.0
 **/
public class BinaryOptimizationS14D12 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 给定数组的最长严格上升子序列的长度。
     * @param arr int整型一维数组 给定的数组
     * @return int整型
     */
    public int LIS (int[] arr) {
        int n=arr.length;
        //特殊情况判断
        if(n==0) return 0;
        //维护一个单调递增的数组
        int[] tail=new int[n];
        //指向tail数组的最后一位
        int end=-1;
        for(int i=0;i<n;i++){
            //如果数组为空或数组末尾值小于arr[i]，直接加在后面
            if(i==0||tail[end]<arr[i]){
                tail[++end]=arr[i];
            }
            //否则找到tail数组中第一个大于等于arr[i]的数的下标，替换为arr[i]
            else{
                int index=binarySearch(tail,end,arr[i]);
                tail[index]=arr[i];
            }
        }
        return end+1;
    }

    //二分法找到tail数组中第一个大于等于arr[i]的数的下标
    private int binarySearch(int[] tail,int end,int target){
        int l=0;
        int r=end;
        while(l<r){
            int mid=l+(r-l)/2;
            if(tail[mid]>=target){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }

}
