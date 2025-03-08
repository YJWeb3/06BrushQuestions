package com.wclass.structalgorithm.stack;

import java.util.Stack;

public class d2_TwoStacksImplementQueue {

	public static class TwoStacksQueue {
		// 进栈
		public Stack<Integer> stackPush;
		// 出栈
		public Stack<Integer> stackPop;
		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();
			stackPop = new Stack<Integer>();
		}

		// push栈向pop栈倒入数据
		private void pushToPop() {
			if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
		}

		/**
		 * 添加元素
		 * @param pushInt
		 */
		public void add(int pushInt) {
			stackPush.push(pushInt);
			// push栈向pop栈倒入数据
			pushToPop();
		}

		/**
		 * 删除元素
		 * @return
		 */
		public int poll() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			}
			// push栈向pop栈倒入数据
			pushToPop();
			return stackPop.pop();
		}

		/**
		 * 队头元素
		 * @return
		 */
		public int peek() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			}
			// push栈向pop栈倒入数据
			pushToPop();
			return stackPop.peek();
		}
	}

	public static void main(String[] args) {
		TwoStacksQueue test = new TwoStacksQueue();
		test.add(1);
		test.add(2);
		test.add(3);
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
		System.out.println(test.peek());
		System.out.println(test.poll());
	}

}
