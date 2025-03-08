package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d4_reverse_order_pairs_array;

/**
 * @program: StructAlgorithm
 * @ClassName MergeSortS13D4
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-19
 * @Version 1.0
 **/
public class MergeSortS13D4 {

    public int mod = 1000000007;
    public int mergeSort(int left, int right, int [] data, int [] temp){
        //停止划分
        if(left >= right)
            return 0;
        //取中间
        int mid = (left + right) / 2;
        //左右划分合并
        int res = mergeSort(left, mid, data, temp) + mergeSort(mid + 1, right, data, temp);
        //防止溢出
        res %= mod;
        int i = left, j = mid + 1;
        for(int k = left; k <= right; k++)
            temp[k] = data[k];
        for(int k = left; k <= right; k++){
            if(i == mid + 1)
                data[k] = temp[j++];
            else if(j == right + 1 || temp[i] <= temp[j])
                data[k] = temp[i++];
                //左边比右边大，答案增加
            else{
                data[k] = temp[j++];
                // 统计逆序对
                res += mid - i + 1;
            }
        }
        return res % mod;
    }
    public int InversePairs(int [] array) {
        int n = array.length;
        int[] res = new int[n];
        return mergeSort(0, n - 1, array, res);
    }

}
