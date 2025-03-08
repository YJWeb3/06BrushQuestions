package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d9_max_value_queue;

/**
 * @program: StructAlgorithm
 * @ClassName ViolenceS5D9
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-13
 * @Version 1.0
 **/
public class ViolenceS5D9 {

    int[] q = new int[20000];
    int begin = 0, end = 0;

    public ViolenceS5D9() {

    }

    public int get_max() {
        int ans = -1;
        for (int i = begin; i != end; ++i) {
            ans = Math.max(ans, q[i]);
        }
        return ans;
    }

    public void add(int value) {
        q[end++] = value;
    }

    public int remove() {
        if (begin == end) {
            return -1;
        }
        return q[begin++];
    }

}
