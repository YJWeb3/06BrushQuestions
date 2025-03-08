package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d11_planetary_collision;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName StackS5D11
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-16
 * @Version 1.0
 **/
public class StackS5D11 {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int aster : asteroids) {
            boolean alive = true;
            while (alive && aster < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -aster; // aster 是否存在
                if (stack.peek() <= -aster) {  // 栈顶行星爆炸
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(aster);
            }
        }
        int size = stack.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
