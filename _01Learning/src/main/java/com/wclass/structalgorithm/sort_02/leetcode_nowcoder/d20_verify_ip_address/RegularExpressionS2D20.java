package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d20_verify_ip_address;

import java.util.regex.Pattern;

/**
 * @program: StructAlgorithm
 * @ClassName RegularExpressionS2D20
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-56
 * @Version 1.0
 **/
public class RegularExpressionS2D20 {

    String solve(String IP) {
        //正则表达式限制0-255 且没有前缀0 四组齐全
        String ipv4="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern ipv4_pattern = Pattern.compile(ipv4);
        //正则表达式限制出现8组，0-9a-fA-F的数，个数必须是1-4个
        String ipv6="([0-9a-fA-F]{1,4}\\:){7}[0-9a-fA-F]{1,4}";
        Pattern ipv6_pattern = Pattern.compile(ipv6);
        //调用正则匹配函数
        if (ipv4_pattern.matcher(IP).matches())
            return "IPv4";
        else if (ipv6_pattern.matcher(IP).matches())
            return "IPv6";
        else return "Neither";
    }

}
