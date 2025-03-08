package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d82_RoateCharArray
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 13:27
 * @Author:NieZheng
 * @Version:1.0
 */
public class d82_RoateCharArray {
    
    public void roateString(char[] str,int offset){ if (str == null || str.length == 0)return;
        offset %= str.length;
        reverse(str,0,str.length - offset - 1);
        reverse(str,str.length - offset,str.length - 1);
        reverse(str,0,str.length - 1);
    }

    private void reverse(char[] str, int start, int end) {
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
        d82_RoateCharArray s = new d82_RoateCharArray();
        s.roateString(new char[]{'a','b','c','d','e','f','g'},3);
    }

}
