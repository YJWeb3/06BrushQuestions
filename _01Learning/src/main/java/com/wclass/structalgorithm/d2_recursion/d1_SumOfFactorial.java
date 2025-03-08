package com.wclass.structalgorithm.d2_recursion;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Scanner;

// 递归求和
public class d1_SumOfFactorial {


	// 1. 方法一：递归法
	public static long f1(int num) {
		// 接收递归结果
		long ans = 0;
		for (int i = 1; i <= num; i++) {
			ans += factorial(i);
		}
		return ans;
	}

	// 递归求乘积
	public static long factorial(int num) {
		long ans = 1;
		for (int i = 1; i <= num; i++) {
			ans *= i;
		}
		return ans;
	}


	// 方法二：迭代法
	public static long f2(int num) {
		// 接收递归结果
		long ans = 0;
		// 记录当前状态
		long cur = 1;
		for (int i = 1; i <= num; i++) {
			cur = cur * i;
			ans += cur;
		}
		return ans;
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("冒泡排序:", new TimesUtil.Task() {
			@Override
			public void execute() {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				System.out.println(f1(num));
				System.out.println(f2(num));
			}
		});
	}

}
