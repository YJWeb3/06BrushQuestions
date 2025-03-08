package com.wclass.structalgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class d2_TwoQueueImplementStack {

	public static class TwoQueueStack<T> {
		// 队列
		public Queue<T> queue;
		// 辅助队列
		public Queue<T> help;

		public TwoQueueStack() {
			// 双链表结构
			queue = new LinkedList<>();
			help = new LinkedList<>();
		}

		// 进栈
		public void push(T value) {
			queue.offer(value);
		}

		// 出栈
		public T pop() {
			while (queue.size() > 1) {
				help.offer(queue.poll());
			}
			T ans = queue.poll();
			// 交换
			Queue<T> tmp = queue;
			queue = help;
			help = tmp;
			return ans;
		}

		// 栈顶
		public T peek() {
			while (queue.size() > 1) {
				help.offer(queue.poll());
			}
			T ans = queue.poll();
			help.offer(ans);
			// 交换
			Queue<T> tmp = queue;
			queue = help;
			help = tmp;
			return ans;
		}

		// 栈是否为空
		public boolean isEmpty() {
			return queue.isEmpty();
		}

	}

}
