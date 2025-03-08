package com.wclass.structalgorithm.stack;

import java.util.Stack;

public class d1_GetMinStack {

	public static class MyStack {
		// 存储原始数据的栈
		private Stack<Integer> stackData;
		// 获取最小值数据的栈
		private Stack<Integer> stackMin;

		public MyStack() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		/**
		 * 进栈
		 * @param newNum
		 */
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum < this.getmin()) {
				this.stackMin.push(newNum);
			} else {
				int newMin = this.stackMin.peek();
				this.stackMin.push(newMin);
			}
			this.stackData.push(newNum);
		}

		/**
		 * 出栈
		 * @return
		 */
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}

		/**
		 * 获取最小值
		 * @return
		 */
		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}

	public static void main(String[] args) {
		MyStack stack1 = new MyStack();
		stack1.push(3);
		System.out.println(stack1.getmin());
		stack1.push(4);
		System.out.println(stack1.getmin());
		stack1.push(1);
		System.out.println(stack1.getmin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getmin());

	}

}
