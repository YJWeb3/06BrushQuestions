package com.wclass.structalgorithm.bit;

// 测试链接：https://leetcode.com/problems/divide-two-integers
public class d5_BitAddMinusMultiDiv {

	/**
	 * 加法运算
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a, int b) {
		int sum = a;
		while (b != 0) {
			// 无进位相加结果
			sum = a ^ b;
			// 进位信息
			b = (a & b) << 1;
			a = sum;
		}
		return sum;
	}

	/**
	 * 减法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int minus(int a, int b) {
		// 反过来即可
		return add(a, negNum(b));
	}
	/**
	 * 取反
	 * @param n
	 * @return
	 */
	public static int negNum(int n) {
		return add(~n, 1);
	}
	/**
	 * 乘法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multi(int a, int b) {
		// 结果
		int res = 0;
		while (b != 0) {
			if ((b & 1) != 0) {
				res = add(res, a);
			}
			a <<= 1;
			b >>>= 1;
		}
		return res;
	}


	/**
	 * 除法
	 * @param a
	 * @param b
	 * @return
	 */
	public static int divide(int a, int b) {
		// 四种情况
		// ab都是最小值
		if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
			return 1;
			// b是最小值
		} else if (b == Integer.MIN_VALUE) {
			return 0;
			// a是最小值：里面有两种情况
		} else if (a == Integer.MIN_VALUE) {
			// b为-1
			if (b == negNum(1)) {
				return Integer.MAX_VALUE;
			} else {
				// a + 1 / b
				int c = div(add(a, 1), b);
				// c + ((a - ( b * c )) / b)
				return add(c, div(minus(a, multi(c, b)), b));
			}
		} else {
			// 最后一种情况，另外一种处理方式
			// a / b
			return div(a, b);
		}
	}

	public static int div(int a, int b) {
		// a为负数
		int x = isNeg(a) ? negNum(a) : a;
		// b为负数
		int y = isNeg(b) ? negNum(b) : b;
		int res = 0;
		for (int i = 30; i >= 0; i = minus(i, 1)) {
			if ((x >> i) >= y) {
				res |= (1 << i);
				x = minus(x, y << i);
			}
		}
		return isNeg(a) ^ isNeg(b) ? negNum(res) : res;
	}
	/**
	 * 是否负数
	 * @param n
	 * @return
	 */
	public static boolean isNeg(int n) {
		return n < 0;
	}

}
