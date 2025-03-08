package com.wclass.structalgorithm.bit;

import java.util.HashMap;
import java.util.HashSet;

public class d7_KM {

	public static int test(int[] arr, int k, int m) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		for (int num : map.keySet()) {
			if (map.get(num) == k) {
				return num;
			}
		}
		return -1;
	}

	// 初始化哈希表
	public static HashMap<Integer, Integer> map = new HashMap<>();

	// 请保证arr中，只有一种数出现了K次，其他数都出现了M次
	public static int onlyKTimes(int[] arr, int k, int m) {
		if (map.size() == 0) {
			// 构建哈希表
			mapCreater(map);
		}
		// 辅助数组
		int[] t = new int[32];
		// t[0] 0位置的1出现了几个
		// t[i] i位置的1出现了几个
		for (int num : arr) {
			while (num != 0) {
				// 取出最右边的1
				int rightOne = num & (-num);
				t[map.get(rightOne)]++;
				num ^= rightOne;
			}
		}
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			if (t[i] % m != 0) {
				if (t[i] % m == k) {
					ans |= (1 << i);
				} else {
					return -1;
				}
			}
		}
		if (ans == 0) {
			int count = 0;
			for (int num : arr) {
				if (num == 0) {
					count++;
				}
			}
			if (count != k) {
				return -1;
			}
		}
		return ans;
	}

	/**
	 * 构建哈希表
	 * @param map
	 */
	public static void mapCreater(HashMap<Integer, Integer> map) {
		int value = 1;
		// 32位
		for (int i = 0; i < 32; i++) {
			map.put(value, i);
			value <<= 1;
		}
	}

}
