package com.wclass.structalgorithm.bit;

public class d2_RandToRand1 {

	// 等概率返回1~5的函数
	public static int f() {
		return (int) (Math.random() * 5) + 1;
	}

	// 等概率得到0和1
	public static int a() {
		int ans = 0;
		do {
			ans = f();
		} while (ans == 3);
		return ans < 3 ? 0 : 1;
	}

	// 等概率返回0~6
	public static int b() {
		int ans = 0;
		do {
			ans = (a() << 2) + (a() << 1) + a();
		} while (ans == 7);
		return ans;
	}

	// 等概率返回1~7
	public static int c() {
		return b() + 1;
	}
}
