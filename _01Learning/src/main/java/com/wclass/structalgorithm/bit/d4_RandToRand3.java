package com.wclass.structalgorithm.bit;

/**
 * ClassName:d4_RandToRand3
 * Package:com.yj.nz.bit.test
 * Description:描述
 *
 * @Date:2023/3/27 0:00
 * @Author:NieZheng
 * @Version:1.0
 */
public class d4_RandToRand3 {

    // 定义一个唯一能借助的随机机制，随机盒子RandomBox
    public static class RandomBox {
        // 定义最小值
        private final int min;
        // 定义最大值
        private final int max;

        // 初始化时请一定不要让mi==ma
        public RandomBox(int mi, int ma) {
            min = mi;
            max = ma;
        }

        /**
         * 随机指定范围的值
         * 例如：13 ~ 17 -> 13 + [0,4]
         * @return
         */
        public int random() {
            return min + (int) (Math.random() * (max - min + 1));
        }

        /**
         * 范围内最小值
         * @return
         */
        public int min() {
            return min;
        }

        /**
         * 范围内最大值
         * @return
         */
        public int max() {
            return max;
        }
    }

    // 利用随机盒子RandomBox，等概率返回0和1
    public static int rand01(RandomBox randomBox) {
        // 获取范围内最小值
        int min = randomBox.min();
        // 获取范围内最大值
        int max = randomBox.max();
        // min ~ max
        int size = max - min + 1;
        // size是不是奇数，odd 奇数
        boolean odd = (size & 1) != 0;
        // 取中间数
        int mid = size / 2;
        int ans = 0;
        do {
            ans = randomBox.random() - min;
        } while (odd && ans == mid);
        return ans < mid ? 0 : 1;
    }

    // 给你一个随机盒子RandomBox，这是唯一能借助的随机机制
    // 等概率返回from~to范围上任何一个数
    // 要求from<=to
    public static int random(RandomBox randomBox, int from, int to) {
        // 一个数，直接返回
        if (from == to) {
            return from;
        }


        // 3 ~ 9
        // 0 ~ 6
        // 0 ~ range
        // 范围区间
        int range = to - from;
        int num = 1;
        // 求0～range需要几个2进制位
        while ((1 << num) - 1 < range) {
            num++;
        }

        // 我们一共需要num位
        // 最终的累加和，首先+0位上是1还是0，1位上是1还是0，2位上是1还是0...
        int ans = 0;
        do {
            ans = 0;
            for (int i = 0; i < num; i++) {
                // 异或进去（异或又称不进位加法）
                ans |= (rand01(randomBox) << i);
            }
        } while (ans > range); // 有个边界条件，需要考虑
        // 通过等概率随机范围内的数字进行相加左边界，就能得到我们的from~to范围上任何一个数
        return ans + from;
    }

}
