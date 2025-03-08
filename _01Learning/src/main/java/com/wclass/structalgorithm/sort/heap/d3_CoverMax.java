package com.wclass.structalgorithm.sort.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最大线段重合问题(堆实现)，敏感度
 */
public class d3_CoverMax {

	/**
	 * 方式一：暴力法
	 * @param lines
	 * @return
	 */
	public static int maxCover1(int[][] lines) {
		// 最小值
		int min = Integer.MAX_VALUE;
		// 最大值
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < lines.length; i++) {
			// 求出每条线段的左端最小值
			min = Math.min(min, lines[i][0]);
			// 求出每条线段的右端最大值
			max = Math.max(max, lines[i][1]);
		}
		int cover = 0;
		for (double p = min + 0.5; p < max; p += 1) {// 从p位置开始直到max，0.5 1.5 2.5 ..... 99.5的距离去探测
			int cur = 0;
			for (int i = 0; i < lines.length; i++) {// 对于每条线段，p点在里面，计数器++
				if (lines[i][0] < p && lines[i][1] > p) {
					cur++;
				}
			}
			cover = Math.max(cover, cur); // 内循环一遍结束后，得到：p点在多少条线段中。外循环结束，得到包含p最多的条数。
		}
		return cover;
	}



	/**
	 * 方式二：优先级队列
	 * @param m 数组
	 * @return
	 */
	public static int maxCover2(int[][] m) {
		Line[] lines = new Line[m.length];
		for (int i = 0; i < m.length; i++) {
			lines[i] = new Line(m[i][0], m[i][1]);
		}
		// 按线段开始位置进行升序
		Arrays.sort(lines, new StartComparator());
		// 小根堆，每一条线段的结尾数值，使用默认的
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int max = 0;
		for (int i = 0; i < lines.length; i++) {
			// lines[i] -> cur  在黑盒中，把<=cur.start 东西都弹出
			while (!heap.isEmpty() && heap.peek() <= lines[i].start) {
				heap.poll();
			}
			heap.add(lines[i].end);
			max = Math.max(max, heap.size());
		}
		return max;
	}

	/**
	 * 随机生成多条线段
	 * @param N
	 * @param L
	 * @param R
	 * @return
	 */
	public static int[][] generateLines(int N, int L, int R) {
		int size = (int) (Math.random() * N) + 1;
		int[][] ans = new int[size][2];
		for (int i = 0; i < size; i++) {
			int a = L + (int) (Math.random() * (R - L + 1));
			int b = L + (int) (Math.random() * (R - L + 1));
			if (a == b) {
				b = a + 1;
			}
			ans[i][0] = Math.min(a, b);
			ans[i][1] = Math.max(a, b);
		}
		return ans;
	}

	/**
	 * 线段
	 */
	public static class Line {
		public int start;
		public int end;

		public Line(int s, int e) {
			start = s;
			end = e;
		}
	}

	/**
	 * 线段开始区域
	 */
	public static class StartComparator implements Comparator<Line> {

		@Override
		public int compare(Line o1, Line o2) {
			return o1.start - o2.start;
		}

	}

	/**
	 * 线段结束区域
	 */
	public static class EndComparator implements Comparator<Line> {

		@Override
		public int compare(Line o1, Line o2) {
			return o1.end - o2.end;
		}

	}


}
