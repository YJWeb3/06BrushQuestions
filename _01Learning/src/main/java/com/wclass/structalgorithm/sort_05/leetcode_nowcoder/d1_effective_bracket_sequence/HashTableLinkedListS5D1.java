package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d1_effective_bracket_sequence;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableLinkedListS5D1
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-23
 * @Version 1.0
 **/
public class HashTableLinkedListS5D1 {

    private static final Map<Character, Character> map = new HashMap<Character, Character>(){{
        put('{', '}'); put('[', ']'); put('(', ')'); put('?','?');
    }};
    public boolean isValid(String s) {

        if(s.length() == 0)
            return false;
        if(s.length() % 2 == 1)
            return false;

        LinkedList<Character> stack = new LinkedList<Character>(){{ add('?'); }};
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch))
                stack.addLast(ch);
            else if(map.get(stack.removeLast()) != ch)
                return false;
        }
        return stack.size() == 1;
    }

}
