package com.wclass.structalgorithm.greedy;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;
import java.util.Comparator;

public class d1_LowestLexicography {

	// 定义一个比较器
	public static class MyComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			return (a + b).compareTo(b + a);
		}
	}

	public static String lowestString(String[] strs) {
		// 数组为空或者没有元素，直接返回空字符串
		if (strs == null || strs.length == 0) {
			return "";
		}
		// 根据自定义的比较规则升序
		Arrays.sort(strs, new MyComparator());
		String res = "";
		// 字符串数组已经升序规则，接下来迭代拼接，即字典序最小的结果。
		for (int i = 0; i < strs.length; i++) {
			res += strs[i];
		}
		return res;
	}

	// for test
	public static String generateRandomString(int strLen) {
		char[] ans = new char[(int) (Math.random() * strLen) + 1];
		for (int i = 0; i < ans.length; i++) {
			int value = (int) (Math.random() * 26);
			ans[i] = (Math.random() <= 0.5) ? (char) (65 + value) : (char) (97 + value);
		}
		return String.valueOf(ans);
	}

	// for test
	public static String[] generateRandomStringArray(int arrLen, int strLen) {
		String[] ans = new String[(int) (Math.random() * arrLen) + 1];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = generateRandomString(strLen);
		}
		return ans;
	}

	// for test
	public static String[] copyStringArray(String[] arr) {
		String[] ans = new String[arr.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = String.valueOf(arr[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		TimesUtil.test("字典序最小的结果:", new TimesUtil.Task() {
			@Override
			public void execute() {
				System.out.println(Arrays.toString(generateRandomStringArray(10,3)));
				System.out.println(lowestString(generateRandomStringArray(10,3)));
			}
		});
	}

}
