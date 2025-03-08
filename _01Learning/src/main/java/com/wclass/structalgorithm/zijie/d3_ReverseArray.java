package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d3_ReverseArray
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 14:19
 * @Author:NieZheng
 * @Version:1.0
 */
public class d3_ReverseArray {

    private static int[] reverseArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while( i <= j ){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] orginArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(orginArray));
        int[] resultArray = reverseArray(orginArray);
        System.out.println(Arrays.toString(resultArray));
    }

}
