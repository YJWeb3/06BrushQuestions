package com.wclass.brush.d2_dynamic.d1_base.d4_longest_common_substring;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01ViolenceLaw
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-17
 * @Version 1.0
 **/
public class Demo01ViolenceLaw {
    //公共子串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //多组输入测试：
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String line2 = scanner.nextLine();
            char[] chars = line.toCharArray();
            char[] chars2 = line2.toCharArray();
            //记录最大长度
            int max = 0;
            //两个字符串，只要有一个为空，我们的长度为0，直接输出
            if (chars.length==0||chars2.length==0){
                System.out.println(0);
            }else {
                //以第一个字符
                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < chars2.length; j++) {
                        int m = i;
                        int k = j;
                        int len = 0;
                        while(m < chars.length&&k <chars2.length&&chars[m]==chars2[k]){
                            len++;
                            m++;
                            k++;
                        }
                        if (len > max){
                            max = len;
                        }
                    }
                }

                System.out.println(max);
            }

        }
    }
}