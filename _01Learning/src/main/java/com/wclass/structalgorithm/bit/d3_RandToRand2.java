package com.wclass.structalgorithm.bit;

/**
 * ClassName:d3_RandToRand2
 * Package:com.yj.nz.bit.test
 * Description:描述
 *
 * @Date:2023/3/27 0:00
 * @Author:NieZheng
 * @Version:1.0
 */
public class d3_RandToRand2 {

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

    // 问题2：利用随机盒子RandomBox，等概率返回0和1
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

}
