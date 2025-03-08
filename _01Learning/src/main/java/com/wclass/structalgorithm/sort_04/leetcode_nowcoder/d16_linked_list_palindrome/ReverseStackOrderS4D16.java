package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d16_linked_list_palindrome;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName ReverseStackOrderS4D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-27
 * @Version 1.0
 **/
public class ReverseStackOrderS4D16 {

    public boolean isPail (ListNode head) {
        ListNode p = head;
        Stack<Integer> s = new Stack();
        //辅助栈记录元素
        while(p != null){
            s.push(p.val);
            p = p.next;
        }
        p = head;
        //正序遍历链表，从栈中弹出的内容是逆序的
        while(!s.isEmpty()){
            //比较是否相同
            if(p.val != s.pop())
                return false;
            p = p.next;
        }
        return true;
    }

}
