package com.wclass.structalgorithm.d2_recursion;//格式1
import java.util.Scanner;

public class d1_FactorialOfN {

    // 方法一：迭代法
    public static int factorial1(int x){//factorial:阶乘
        int result = 1;//乘积
        for (int i = 1; i <= x ; i++) {
            result = result * i;
        }
        return result;
    }

    // 方法二：递归法
    public static int factorial2(int x) {//factorial:阶乘
        if (x == 1) {
            return 1;
        }
        return x * factorial2(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int result = sc.nextInt();
        System.out.println(result+"的阶乘为："+factorial1(result));
    }
}
