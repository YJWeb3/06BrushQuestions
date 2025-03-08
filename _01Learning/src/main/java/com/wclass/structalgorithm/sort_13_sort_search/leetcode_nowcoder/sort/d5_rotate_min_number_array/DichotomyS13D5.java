package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d5_rotate_min_number_array;

/**
 * @program: StructAlgorithm
 * @ClassName DichotomyS13D5
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-21
 * @Version 1.0
 **/
public class DichotomyS13D5 {

    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            //最小的数字在mid右边
            if(array[mid] > array[right])
                left = mid + 1;
                //无法判断，一个一个试
            else if(array[mid] == array[right])
                right--;
                //最小数字要么是mid要么在mid左边
            else
                right = mid;
        }
        return array[left];
    }

}
