package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:d33_ToArrayList
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:02
 * @Author:NieZheng
 * @Version:1.0
 */
public class d33_ToArrayList {

    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public List<Integer> toArrayList(ListNode head){
        List<Integer> result = new ArrayList<>();
        while(head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

}
