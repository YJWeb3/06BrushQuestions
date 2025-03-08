package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d11_ReverseWords
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 12:48
 * @Author:NieZheng
 * @Version:1.0
 */
public class d11_ReverseWords {

    public static String reverseWords(String s){
        if(s.length() == 0 || s ==null){
            return "";
        }
        // 按照空格将s切分
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        // 从后往前遍历array, 在sb中插入单词
        for (int i = array.length - 1; i >= 0; i--) {
            if(!array[i].equals("")){
                if(sb.length() > 0 ){
                    sb.append(" ");
                }
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String orginString = "hello world";
        System.out.println(reverseWords((orginString)));
    }
}
