package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d2_search_2d_matrix‌;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D2
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-18
 * @Version 1.0
 **/
public class BinarySearchS13D2 {

    public boolean Find(int target, int [][] array) {
        //优先判断特殊
        if(array.length == 0)
            return false;
        int n = array.length;
        if(array[0].length == 0)
            return false;
        int m = array[0].length;
        //从最左下角的元素开始往左或往上
        for(int i = n - 1, j = 0; i >= 0 && j < m; ){
            //元素较大，往上走
            if(array[i][j] > target)
                i--;
                //元素较小，往右走
            else if(array[i][j] < target)
                j++;
            else
                return true;
        }
        return false;
    }

}
