package com.wclass.structalgorithm.sort;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:d1_bubble
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/10 23:09
 * @Author:NieZheng
 * @Version:1.0
 */
public class d1_BubbleSort {

    // 方式一：算法的时间复杂度为O(n^2)(即使是在最好的情况下)
    public static void bubbleSort1(int[] array) {
		// 数组为null或者元素只有一个没必要排序
		if (array == null || array.length < 2) {
			return;
		}
		// 开始
		for (int end = array.length - 1; end > 0; end--) {
			// 逐个相邻元素比较
			for (int begin = 1; begin <= end; begin++) {
				// 满足条件交换
				if (array[begin] < array[begin - 1]) {
					// 交换
					int tmp = array[begin];
					array[begin] = array[begin - 1];
					array[begin - 1] = tmp;
				}
			}
		}
	}

    // 方式二：可以通过增加一个附加标记来改进该算法。如果序列已经是有序的，则可以通过判断该标记来结束算法。
    // 最坏、平均时间复杂度：O(n^2）、最好时间复杂度：O(n)、空间复杂度：O(1)
	public static void bubbleSort2(int[] array) {
		// 数组为null或者元素只有一个没必要排序
		if (array == null || array.length < 2) {
			return;
		}
		for (int end = array.length - 1; end > 0; end--) {
			// sortedIndex的初始值在数组完全有序的时候有用
			int sortedIndex = 1;
			for (int begin = 1; begin <= end; begin++) {
				if (array[begin] < array[begin - 1]) {
					int tmp = array[begin];
					array[begin] = array[begin - 1];
					array[begin - 1] = tmp;
					// 需要改下有序索引位置
					sortedIndex = begin;
				}
			}
			// 有序索引位置作为最后一个位置
			end = sortedIndex;
		}
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("冒泡排序:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(Arrays.toString(orginNums));
				bubbleSort1(orginNums);
				System.out.println(Arrays.toString(orginNums));
			}
		});
	}
}
