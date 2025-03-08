package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d86_Stack
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/17 14:17
 * @Author:NieZheng
 * @Version:1.0
 */
public class d86_Stack {

    private List<Integer> array = new ArrayList<>();

    public void push(int x){
        array.add(x);
    }

    public void popo(){
        int n = array.size();
        if (n > 0)
            array.remove(n-1);
        return;
    }

    public int top(){
        int n = array.size();
        return array.get(n-1);
    }

    public boolean isEmpty(){
        return array.size() == 0;
    }
}
