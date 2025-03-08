package com.wclass.structalgorithm.string;

public class bruteforce1 {
    public static void main(String[] args) {
        // 主串
        String[] a = {"a","b","c","d","e","f","g","h"};
        // 子串
        String[] b = {"e","f"};
        // 标记
        int flag = 0;
        for (int i = 0; i < a.length - b.length; i++) {
            int j = 0;
            while (j < b.length && b[j] == a[i+j]) {
                j = j+1;
                if (j == b.length-1) {
                    flag = 1;
                    System.out.println(i);
                }
            }
        }
        if (flag == 0) {
            System.out.println("no find");
        }
    }
}