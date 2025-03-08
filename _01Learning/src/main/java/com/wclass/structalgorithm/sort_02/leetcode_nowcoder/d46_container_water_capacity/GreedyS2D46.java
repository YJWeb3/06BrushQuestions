package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d46_container_water_capacity;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS2D46
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-05
 * @Version 1.0
 **/
public class GreedyS2D46 {

    public int maxArea (int[] height) {
        //排除不能形成容器的情况
        if(height.length < 2)
            return 0;
        int res = 0;
        //双指针左右界
        int left = 0;
        int right = height.length - 1;
        //共同遍历完所有的数组
        while(left < right){
            //计算区域水容量
            int capacity = Math.min(height[left], height[right]) * (right - left);
            //维护最大值
            res = Math.max(res, capacity);
            //优先舍弃较短的边
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    }

}
