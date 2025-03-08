package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d47_receive_rainwater;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D47
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-06
 * @Version 1.0
 **/
public class TwoPointersS2D47 {

    public long maxWater (int[] arr) {
        //排除空数组
        if(arr.length == 0)
            return 0;
        long res = 0;
        //左右双指针
        int left = 0;
        int right = arr.length - 1;
        //中间区域的边界高度
        int maxL = 0;
        int maxR = 0;
        //直到左右指针相遇
        while(left < right){
            //每次维护往中间的最大边界
            maxL = Math.max(maxL, arr[left]);
            maxR = Math.max(maxR, arr[right]);
            //较短的边界确定该格子的水量
            if(maxR > maxL)
                res += maxL - arr[left++];
            else
                res += maxR - arr[right--];
        }
        return res;
    }

}
