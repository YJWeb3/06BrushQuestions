package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d6_compare_version;

/**
 * @program: StructAlgorithm
 * @ClassName SplitInterceptS13D6
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-24
 * @Version 1.0
 **/
public class SplitInterceptS13D6 {

    public int compare (String version1, String version2) {
        //按照.划分
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        for(int i = 0; i < nums1.length || i < nums2.length; i++){
            //较短的版本号后续都取0
            String str1 = i < nums1.length ? nums1[i] : "0";
            String str2 = i < nums2.length ? nums2[i] : "0";
            long num1 = 0;
            //字符串转数字
            for(int j = 0; j < str1.length(); j++)
                num1 = num1 * 10 + (str1.charAt(j) - '0');
            long num2 = 0;
            for(int j = 0; j < str2.length(); j++)
                num2 = num2 * 10 + (str2.charAt(j) - '0');
            //比较数字大小
            if(num1 > num2)
                return 1;
            if(num1 < num2)
                return -1;
        }
        //版本相同
        return 0;
    }

}
