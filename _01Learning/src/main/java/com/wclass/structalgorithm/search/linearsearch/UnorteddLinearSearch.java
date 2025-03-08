package com.wclass.structalgorithm.search.linearsearch;

import com.wclass.structalgorithm.util.TimesUtil;

/**
 * ClassName:ss
 * Package:com.yj.nz.search.seqsearch
 * Description:描述
 *
 * @Date:2023/3/25 14:12
 * @Author:NieZheng
 * @Version:1.0
 */
public class UnorteddLinearSearch {
    public static int unorteddLinearSearch (int array[], int data) {
        // 数组为null或者没有元素，没必要查找
        if (array == null || array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data)
                return i;
        }
        return -1;
    }
    // for test
    public static void main(String[] args) {
        TimesUtil.test("无序线性查找:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(	unorteddLinearSearch(orginNums,2) );
            }
        });
    }
}
