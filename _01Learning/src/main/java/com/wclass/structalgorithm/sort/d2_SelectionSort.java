package com.wclass.structalgorithm.sort;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:d2_SelectionSort
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/10 23:31
 * @Author:NieZheng
 * @Version:1.0
 */
public class d2_SelectionSort {

    public static void selectionSort(int[] array) {
		// 数组为null或者元素只有一个没必要排序
		if (array == null || array.length < 2) {
			return;
		}
		for (int end = array.length - 1; end > 0; end--) {
			// 最大元素的位置
			int maxIndex = 0;
			// 开始找
			for (int begin = 1; begin <= end; begin++) {
				// 找到变更最大元素位置
				if (array[maxIndex] <= array[begin]) {
					maxIndex = begin;
				}
			}
			// 元素交换位置
			int tmp = array[maxIndex];
			array[maxIndex] = array[end];
			array[end] = tmp;
		}
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("选择排序:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(Arrays.toString(orginNums));
				selectionSort(orginNums);
				System.out.println(Arrays.toString(orginNums));
			}
		});
	}
}
