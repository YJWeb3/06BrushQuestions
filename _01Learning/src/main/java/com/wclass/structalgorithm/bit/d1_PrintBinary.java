package com.wclass.structalgorithm.bit;

public class d1_PrintBinary {

	// 打印整型数字的二进制算法
	public static void print(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print((num & (1 << i)) == 0 ? "0" : "1");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 整数类型：32位字节
//		int num = 4;
//		System.out.println("打	印4的二进制形式");
//		print(num);


//		System.out.println("我们已经实现打印整型的二进制算法，接下来测试下右移位（<<）的算法思路");
//		int test = 1123123;
//		print(test);
//		print(test<<1);
//		print(test<<2);
//		print(test<<8);

//		System.out.println("看看-1的二进制形式");
//		print(-1);
//		int a = Integer.MIN_VALUE;
//		print(a);

//		System.out.println("测试取反运算符~的作用");
//		int b = 123823138;
//		int c = ~b;
//		print(b);
//		print(c);

//		System.out.println("看看Java中int类型的最大值/最小值为过少");
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);


//		System.out.println("测试位运算中的|、&、^的作用");
//		int a = 12319283;
//		int b = 3819283;
//		print(a);
//		print(b);
//		System.out.println("=============");
//		///
//		print(a | b);
//		print(a & b);
//		print(a ^ b);
//

//		System.out.println("测试下位运算中的>>、>>>的作用");
//		int a = Integer.MIN_VALUE;
//		print(a);
//		print(a >> 1);
//		print(a >>> 1);

		System.out.println("测试下当数字最小情况下，取负数，会怎么样。");
		int c = Integer.MIN_VALUE;
		int d = -c ;
		System.out.println(c);
		System.out.println(-c);
		print(c);
		print(d);

	}

}
