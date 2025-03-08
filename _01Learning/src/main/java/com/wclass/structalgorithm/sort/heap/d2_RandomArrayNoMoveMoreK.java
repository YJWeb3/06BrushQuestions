package com.wclass.structalgorithm.sort.heap;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:d2_
 * Package:com.yj.nz.sort.heap
 * Description:描述
 *
 * @Date:2023/4/14 22:39
 * @Author:NieZheng
 * @Version:1.0
 */
public class d2_RandomArrayNoMoveMoreK {
    /**
     *
     * @param maxSize 数组随机的最大容量
     * @param maxValue 数组存储的数据随机的最大值
     * @param K
     * @return
     */
    public static int[] randomArrayNoMoveMoreK(int maxSize, int maxValue, int K) {
        // 随机一个数组
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        // 依次赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        // 先排个序
        Arrays.sort(arr);
        // 然后开始随意交换，但是保证每个数距离不超过K
        // swap[i] == true, 表示i位置已经参与过交换
        // swap[i] == false, 表示i位置没有参与过交换
        boolean[] isSwap = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = Math.min(i + (int) (Math.random() * (K + 1)), arr.length - 1);
            if (!isSwap[i] && !isSwap[j]) {
                isSwap[i] = true;
                isSwap[j] = true;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return arr;
    }
    // for test
    // for test
    public static void main(String[] args) {
        TimesUtil.test("堆排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                System.out.println(Arrays.toString(randomArrayNoMoveMoreK(10,10,3)));
            }
        });
    }
}
