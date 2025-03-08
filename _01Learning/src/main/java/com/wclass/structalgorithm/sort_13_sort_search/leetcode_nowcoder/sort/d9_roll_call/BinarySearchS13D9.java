package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d9_roll_call;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D9
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-27
 * @Version 1.0
 **/
public class BinarySearchS13D9 {

    public int takeAttendance(int[] records) {
        int i = 0, j = records.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(records[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


}
