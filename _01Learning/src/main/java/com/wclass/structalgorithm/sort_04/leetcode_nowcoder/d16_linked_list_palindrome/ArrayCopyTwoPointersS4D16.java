package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d16_linked_list_palindrome;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName ArrayCopyTwoPointersS4D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-22
 * @Version 1.0
 **/
public class ArrayCopyTwoPointersS4D16 {

    public boolean isPail (ListNode head) {
        ArrayList<Integer> nums = new ArrayList();
        //将链表元素取出一次放入数组
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        //双指针指向首尾
        int left = 0;
        int right = nums.size() - 1;
        //分别从首尾遍历，代表正序和逆序
        while(left <= right){
            int x = nums.get(left);
            int y = nums.get(right);
            //如果不一致就是不为回文
            if(x != y)
                return false;
            left++;
            right--;
        }
        return true;
    }

}
