package com.wclass.structalgorithm.zijie;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * ClassName:d52_ArrayListManager
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 13:31
 * @Author:NieZheng
 * @Version:1.0
 */
public class d52_ArrayListManager {

    public static ArrayList<Integer> create(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    public static ArrayList<Integer> clone(ArrayList<Integer> list){
        ArrayList<Integer> dist = new ArrayList<>();
        for (Integer a: list){
            dist.add(a);
        }
        return dist;
    }

    public static int get(ArrayList<Integer> list,int k){
        return list.get(k);
    }

    public static void set(ArrayList<Integer> list,int k,int val){
        list.set(k,val);
    }


    public static void remove(ArrayList<Integer> list,int k){
        list.remove(k);
    }

    public static int indexOf(ArrayList<Integer> list,int val){
        if (list == null)
            return -1;
        return list.indexOf(val);
    }
}
