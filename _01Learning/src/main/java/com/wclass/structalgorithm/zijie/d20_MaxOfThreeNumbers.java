package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d20_MaxOfThreeNumbers
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 15:51
 * @Author:NieZheng
 * @Version:1.0
 */
public class d20_MaxOfThreeNumbers {

    public static int maxOfThreeNumbers(int a,int b,int c){
        if (a >= b && a >= c){
            return a;
        }else if(b >= a && b >= c){
            return b;
        }else{
            return c;
        }
    }

    public static int maxOfThreeNumbers1(int a,int b,int c){
        if (a >= b && a >= c)
            return a;
        else if (b >= c)
            return b;
        else
            return c;
    }

    public static int maxOfThreeNumbers2(int a,int b,int c){
        int max = Math.max(a,b);
        return max = Math.max(max,c);
    }

}
