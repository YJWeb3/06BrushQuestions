package com.wclass.structalgorithm.bitmap;

import java.util.HashSet;

public class d1_BitMap {

	// 这个类的实现是正确的
	public static class BitMap {

		private long[] bits;

		public BitMap(int max) {
			// (max + 64) >> 6 -> (max + 64) / 64
			bits = new long[(max + 64) >> 6];
		}

		/**
		 * 加法
		 * @param num
		 */
		public void add(int num) {
			// num >> 6 -> num / 64 -> 哪个整数
			// num % 64 -> num & 63
			bits[num >> 6] |= (1L << (num & 63));
		}

		/**
		 * 减法
		 * @param num
		 */
		public void delete(int num) {
			bits[num >> 6] &= ~(1L << (num & 63));
		}

		/**
		 * 包含某个数字
		 * @param num
		 * @return
		 */
		public boolean contains(int num) {
			return (bits[num >> 6] & (1L << (num & 63))) != 0;
		}

	}
}
