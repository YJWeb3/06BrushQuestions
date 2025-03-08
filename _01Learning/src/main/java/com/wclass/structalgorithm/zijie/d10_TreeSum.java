package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:d10_TreeSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 16:28
 * @Author:NieZheng
 * @Version:1.0
 */
public class d10_TreeSum {

    public static List<List<Integer>> treeSum(int[] numbers){
        List<List<Integer>> res = new ArrayList<>();
        if (numbers == null || numbers.length < 3){
            return res;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]){
                continue;
            }
            int target = 0 - numbers[i];
            int left = i + 1,right = numbers.length - 1;
            while (left < right){
                if (numbers[left] + numbers[right] == target){
                    res.add(Arrays.asList(numbers[i],numbers[left],numbers[right]));

                    while (left < right && numbers[left] == numbers[left + 1]){
                        left++;
                    }
                    while (left < right && numbers[right] == numbers[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (numbers[left] + numbers[right] < target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] orginArrays = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = treeSum(orginArrays);
        System.out.println(result);
    }
}
