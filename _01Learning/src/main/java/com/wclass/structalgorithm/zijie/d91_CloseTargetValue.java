package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d91_CloseTargetValue
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/18 14:24
 * @Author:NieZheng
 * @Version:1.0
 */
public class d91_CloseTargetValue {

    // 双指针法
    public int closeTargetVallue(int target,int[] array){
        int n = array.length;
        if(array.length < 2){
            return -1;
        }
        Arrays.sort(array);
        int diff = Integer.MAX_VALUE;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if (array[left] + array[right] > target){
                right--;
            }else {
                diff = Math.min(diff,target - (array[left] + array[right]));
                left++;
            }
        }
        if (diff == Integer.MAX_VALUE){
            return -1;
        }else {
            return target - diff;
        }
    }

}
