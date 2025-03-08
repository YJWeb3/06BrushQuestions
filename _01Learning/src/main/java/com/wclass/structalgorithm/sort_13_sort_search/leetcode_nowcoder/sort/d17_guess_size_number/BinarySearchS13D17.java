package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d17_guess_size_number;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D17
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-40
 * @Version 1.0
 **/
public class BinarySearchS13D17 {

    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (guessNumber(mid) <= 0) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

}
