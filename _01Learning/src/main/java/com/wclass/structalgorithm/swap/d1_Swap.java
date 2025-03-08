package com.wclass.structalgorithm.swap;

public class d1_Swap {
	
	public static void main(String[] args) {
		// 异或交换
		int a = 16;
		int b = 603;
		System.out.println(a);
		System.out.println(b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);

		// 数组内交换
		int[] arr = {3,1,100};
		int i = 0;
		int j = 0;
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
		System.out.println(arr[i] + " , " + arr[j]);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		swap(arr, 0, 0);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}
	

	// 封装交换算法
	public static void swap (int[] arr, int i, int j) {
		// 不能同向交换
		// arr[0] = arr[0] ^ arr[0];
		arr[i]  = arr[i] ^ arr[j];
		arr[j]  = arr[i] ^ arr[j];
		arr[i]  = arr[i] ^ arr[j];
	}

}
