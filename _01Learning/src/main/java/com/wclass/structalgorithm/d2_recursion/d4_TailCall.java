package com.wclass.structalgorithm.d2_recursion;

public class d4_TailCall {
	
	public static void main(String[] args) {
		System.out.println(facttorial1(4));
	}
	
	/**
	 * 1 * 2 * 3 * 4 * ... * (n - 1) * n
	 * @param n
	 * @return
	 */
	static int facttorial1(int n) {
		return facttorial1(n, 1);
	}
	
	static int facttorial1(int n, int result) {
		if (n <= 1) return result;
		return facttorial1(n - 1, result * n);
	}
	
	static int facttorial2(int n) {
		if (n <= 1) return n;
		return n * facttorial2(n - 1);
	}
}
