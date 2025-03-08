package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d26_LowercaseToUppercase
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:12
 * @Author:NieZheng
 * @Version:1.0
 */
public class d26_LowercaseToUppercase {

    public char lowercaseToUppercase(char character){
        return (char) (character - 'a' + 'A');
    }

    public char lowercaseToUppercase2(char character){
        return Character.toUpperCase(character);
    }
}
