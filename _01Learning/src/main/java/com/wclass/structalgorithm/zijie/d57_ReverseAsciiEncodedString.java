package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d57_ReverseAsciiEncodedString
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 13:02
 * @Author:NieZheng
 * @Version:1.0
 */
public class d57_ReverseAsciiEncodedString {

    public String reverseAsciiEncodedString(String encodeString){
        if (encodeString == null)
            return "";
        int asciiNumber = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = encodeString.length() - 1; i > 0 ; i-=2) {
            asciiNumber = (encodeString.charAt(i - 1) - '0') * 10 + encodeString.charAt(i) - '0';
            stringBuffer.append((char)(asciiNumber));
        }
        return stringBuffer.toString();
    }
}
