package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d36_LowercaseToUppercase2
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:28
 * @Author:NieZheng
 * @Version:1.0
 */
public class d36_LowercaseToUppercase2 {

    public String lowercaseToUppercase2(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int index = 0; index < sb.length(); index++) {
            char ch = sb.charAt(index);
            if (Character.isLowerCase(ch)){
                sb.setCharAt(index,Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }

}
