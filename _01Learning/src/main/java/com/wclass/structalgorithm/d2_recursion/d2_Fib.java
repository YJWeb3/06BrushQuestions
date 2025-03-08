package com.wclass.structalgorithm.d2_recursion;

public class d2_Fib {

	//  方式一：经典求法（时间复杂度O(n^2)）
	public static int fib1(int n) {
		if(n < 1) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}

		return fib1(n-1) + fib1(n-2);
	}

	// 方式二：顺序求法（时间复杂度O(n)）
	public static int fib2(int n) {
		if(n < 1) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}
		int res = 1;
		int pre = 1;
		int temp = 0;
		for(int i = 3; i < n; i++) {
			temp = res;
			res = pre + res;
			pre  = temp;
		}
		return res;
	}

	//特征矩阵法（时间复杂度O(logn)）
	//求矩阵m的p次幂的值
	public static int[][] matrixPower(int[][] m, int p){
		int [][] res = new int[m.length][m[0].length];
		//先把res设为单位矩阵，相当于整数中的1
		for (int i = 0; i < res.length; i++) {
			res[i][i] = 1;
		}
		//临时矩阵
		int [][] tmp = m;
		for (; p != 0; p >>= 1) {
			if ((p & 1) != 0) {
				//按位与操作，其实也就是位置为1的乘把这个矩阵乘一下
				res = muliMatrix(res, tmp);
			}
			//等于0 的时候我临时矩阵自己乘一下
			tmp = muliMatrix(tmp, tmp);
		}
		return res;
	}
	//两矩阵相乘
	public static int[][] muliMatrix(int[][] m1, int[][] m2) {
		//构造出一个m1行和m2列的矩阵（矩阵相乘规则）
		int [][] res = new int[m1.length][m2[0].length];
		//给我们要得到的矩阵的每一个元素的值进行赋值操作
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m2[0].length; j++) {
				for(int k = 0; k < m2.length; k++) {
					//i，j位置元素的值就是i行元素和j行元素乘积的加和
					res[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return res;
	}
	//利用矩阵乘法求解斐波那契数列第n项的值
	public int fib3(int n){
		if(n < 1) {
			return 0;
		}else if(n == 1 || n == 2) {
			return 1;
		}
		//状态矩阵
		int[][] base = {{1,1},{1,0}};
		//最后的结果需要求矩阵的n-2次
		int [][] res = matrixPower(base, n-2);
		return res[0][0] + res[1][0];
	}

	// 方式四：常微分方程解法（时间复杂度O(1)）
	public int fib4(int n) {
		double sqrt5=Math.sqrt(5);
		double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
		return (int)(fibn/sqrt5);
	}

}

