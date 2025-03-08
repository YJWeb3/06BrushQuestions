package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d34_contrastive_color_matching;

/**
 * @program: StructAlgorithm
 * @ClassName GroupingXORS1D34
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-43
 * @Version 1.0
 **/
public class GroupingXORS1D34 {

    public int[] sockCollocation(int[] sockets) {
        int ret = 0;
        for (int n : sockets) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : sockets) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }

}
