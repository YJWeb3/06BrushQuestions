package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d4_reverse_order_pairs_array;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName BinaryIndexedTreeS13D4
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-20
 * @Version 1.0
 **/
public class BinaryIndexedTreeS13D4 {

    public int mod = 1000000007;
    public int InversePairs(int [] array) {
        int n = array.length;
        int[] temp = new int[n];
        System.arraycopy(array, 0, temp, 0, n);
        //排序得到一份有序的数组
        Arrays.sort(temp);
        //二分法重新映射，将数字变成其在有序数组中的位置
        for (int i = 0; i < n; ++i)
            //二分法查找在其在有序数组中的位置
            array[i] = Arrays.binarySearch(temp, array[i]) + 1;
        //建立大小为n的树状数组
        BIT bit = new BIT(n);
        int res = 0;
        //统计逆序对
        for(int i = 0; i < n; i++){
            //前缀和做差
            res = (res + bit.query(n) - bit.query(array[i])) % mod;
            bit.update(array[i]);
        }
        return res;
    }

}

class BIT {
    private int[] tree;
    private int n;
    //初始化树状数组的大小
    public BIT(int m) {
        this.n = m;
        this.tree = new int[m + 1];
    }
    //使数组呈现2、4、8、16这种树状
    public int lowbit(int x) {
        return x & (-x);
    }
    //查询序列1到x的前缀和
    public int query(int x) {
        int res = 0;
        while(x != 0){
            res += tree[x];
            x -= lowbit(x);
        }
        return res;
    }
    //序列x位置的数加1
    public void update(int x) {
        while(x <= n){
            tree[x]++;
            x += lowbit(x);
        }
    }
}