package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d3_rotate_array;

/**
 * @program: StructAlgorithm
 * @ClassName CircularReplacementS2D3
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-59
 * @Version 1.0
 **/
public class CircularReplacementS2D3 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(k, n);
        for (int start = 0; start < count; ++start) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }
    }

    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

}
