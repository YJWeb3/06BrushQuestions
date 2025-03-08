package com.wclass.structalgorithm.d0_test;

import java.util.Scanner;
 
 
public class Shift_And {
	static Scanner input=new Scanner(System.in);
	
	//Shift And算法
	static int Shift_And_Mathch(String word,String text) {
		int []Index=new int[256+10];
		
		//预处理模式串过程
		for(int i=0;i<word.length();i++) {
			Index[word.charAt(i)]|=(0x01<<i);
		}
		int npos=0;//当前主串的下标
		int Set=0;//记录word的前缀同时是text的后缀
		int tag=1<<(word.length()-1);
		
		while(npos<text.length()) {
			//函数是字符相同且位置一致，Set的最高位1反应了模式串的最大匹配长度
			Set=((Set<<1)|(0x01))&Index[text.charAt(npos)];
			if((Set&tag)!=0) { //匹配成功模式串的最高位
				return npos-(word.length()-1);
			}
			npos++;
		}
		return -1;
	}
	
	public static void main(String[] str) {
		while(true) {
			String text=input.next();
			String word=input.next();
			int ans=Shift_And_Mathch(word,text);
			System.out.println(word+"在"+text+"中首次出现在第"+ans+"个位置！");
		}
	}
}