package com.wclass.structalgorithm.zijie;

import java.util.Arrays;
import java.util.HashMap;

/**
 * ClassName:d24_TwoSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 15:33
 * @Author:NieZheng
 * @Version:1.0
 */
public class d24_TwoSum {

    public int[] towSum(int[] numbers,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = {0,0};
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null){
                int[] res = {map.get(numbers[i]),i};
                return res;
            }
            map.put(target-numbers[i],i);
        }
        return result;
    }

    public int[] twoSum(int[] numbers,int target){
        int[] backUp = new int[numbers.length];
        System.arraycopy(numbers,0,backUp,0,numbers.length);
        Arrays.sort(numbers);
        int i = 0,j = numbers.length-1;
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                break;
            }else if (numbers[i] + numbers[j] < target){
                i += 1;
            }else {
                j -= 1;
            }
        }
        int a = 0,b = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (backUp[k] == numbers[i] && a == 0){
                i = k;
                a = 1;
            }else if (backUp[k] == numbers[i] && a == 0){
                j = k;
                b = 1;
            }else if (a == 1 && b == 1){
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = i;
        ans[1] = j;
        Arrays.sort(ans);
        return ans;
    }
}
