package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d16_linked_list_palindrome;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: StructAlgorithm
 * @ClassName ArrayCopyReversalS4D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-18
 * @Version 1.0
 **/
public class ArrayCopyReversalS4D16 {

    public boolean isPail (ListNode head) {
        ArrayList<Integer> nums = new ArrayList();
        //将链表元素取出一次放入数组
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> temp = new ArrayList();
        temp = (ArrayList<Integer>) nums.clone();
        //准备一个数组承接翻转之后的数组
        Collections.reverse(temp);
        for(int i = 0; i < nums.size(); i++){
            int x = nums.get(i);
            int y = temp.get(i);
            //正向遍历与反向遍历相同
            if(x != y)
                return false;
        }
        return true;
    }

}
