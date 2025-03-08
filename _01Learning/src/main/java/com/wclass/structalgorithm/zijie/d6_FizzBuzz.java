package com.wclass.structalgorithm.zijie;

import java.util.*;

/**
 * ClassName:d6_FizzBuzz
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 14:48
 * @Author:NieZheng
 * @Version:1.0
 */
public class d6_FizzBuzz {

    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            }else if(i % 5 == 0){
                results.add("buzz");
            }else if (i % 3 == 0){
                results.add("fizz");
            }else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }


    public static List<String> fizzBuzz2(int n){
        List<String> result = new ArrayList<>();
        Map map = new HashMap<>();
        map.put(3,"fizz");
        map.put(5,"buzz");
        for (int i = 1; i <= n; i++) {
            String str1 = (String)map.get(i % 3 * 10 + 3);
            String str2 = (String)map.get(i % 5 * 10 + 5);
            String value = str1 + ' ' + str2;
            value = value.replace("null ","").replace("null ","")
                    .replace("null","");
            if (value.length() == 0){
                value = String.valueOf(i);
            }
            result.add(value);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(15);
        List<String> result2 = fizzBuzz2(15);
        System.out.println(result);
        System.out.println(result2);
    }
}
