package com.wclass.structalgorithm.search.linearsearch;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:s
 * Package:com.yj.nz.search.linearsearch
 * Description:描述
 *
 * @Date:2023/3/25 14:22
 * @Author:NieZheng
 * @Version:1.0
 */
public class SortedLinearSearch {

    public static int sortedLinearSearch(int array[], int data) {
        // 默认升序规则
        Arrays.sort(array);
        // 数组为null或者没有元素，没必要查找
        if (array == null || array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data)
                return i;
            // 如果数组中前面已经有一个数大于这个要查找的数，后面的数就都会都比这个数要大，就没有必要比较了，直接结束，返回-1
            else if (array[i] > data) {
                return -1;
            }
        }
        return -1;
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("无序线性查找:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(sortedLinearSearch(orginNums,2) );
            }
        });
    }
}
