package com.wclass.structalgorithm.zijie;

import java.util.HashMap;

/**
 * ClassName:d102_RandomListNode
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/22 14:31
 * @Author:NieZheng
 * @Version:1.0
 */
class RandomListNode{
    int label;
    RandomListNode next,random;
    RandomListNode(int x){
        this.label = x;
    }
}
public class d102_RandomListNode {

    // HashMap
    public RandomListNode copyRandomList(RandomListNode head){
        if (head == null){
            return null;
        }
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy,newNode;
        while(head != null){
            if (map.containsKey(head)){
                newNode = map.get(head);
            }else {
                newNode = new RandomListNode(head.label);
                map.put(head,newNode);
            }
            pre.next = newNode;

            if (head.random != null){
                if (map.containsKey(head.random)){
                    newNode.random = map.get(head.random);
                }else {
                    newNode.random = map.get(head.random.label);
                    map.put(head.random,newNode.random);
                }
            }
            pre = newNode;
            head = head.next;
        }
        return dummy.next;
    }
}
