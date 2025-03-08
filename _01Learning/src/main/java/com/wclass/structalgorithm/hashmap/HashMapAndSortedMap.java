package com.wclass.structalgorithm.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndSortedMap {

	// 构建一个节点
	public static class Node {
		public int value;

		public Node(int v) {
			value = v;
		}
	}

	// (K V)表
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		// 存值
		map.put("yjxz", "我是政哥");
		// 值是否存在
		System.out.println(map.containsKey("yjxz"));// true
		System.out.println(map.containsKey("zhengge"));// false
		// 获取值
		System.out.println(map.get("yjxz"));// 我是政哥

		// 存值
		map.put("yjxz", "他是政哥");
		// 获取值
		System.out.println(map.get("yjxz"));// 他是政哥

		// 移除某个值
		map.remove("yjxz");
		// 值是否存在
		System.out.println(map.containsKey("yjxz"));// false
		// 获取值
		System.out.println(map.get("yjxz"));// null

		String test1 = "yjxz";
		String test2 = "yjxz";
		// 值是否存在
		System.out.println(map.containsKey(test1));// false
		// 值是否存在
		System.out.println(map.containsKey(test2));// false

		HashMap<Integer, String> map2 = new HashMap<>();
		// 存值
		map2.put(1234567, "我是1234567");

		Integer a = 1234567;
		Integer b = 1234567;

		System.out.println(a == b);// false
		// 值是否存在
		System.out.println(map2.containsKey(a));// true
		// 值是否存在
		System.out.println(map2.containsKey(b));// true

		Node node1 = new Node(1);
		Node node2 = new Node(1);
		HashMap<Node, String> map3 = new HashMap<>();
		// 存值
		map3.put(node1, "我进来了！");
		// 值是否存在
		System.out.println(map3.containsKey(node1));// true
		// 值是否存在
		System.out.println(map3.containsKey(node2));// false

		System.out.println("===================");

		// 构建树集
		TreeMap<Integer, String> treeMap1 = new TreeMap<>();
		// 存值
		treeMap1.put(3, "我是3");
		treeMap1.put(0, "我是3");
		treeMap1.put(7, "我是3");
		treeMap1.put(2, "我是3");
		treeMap1.put(5, "我是3");
		treeMap1.put(9, "我是3");

		System.out.println(treeMap1.containsKey(7));// true
		System.out.println(treeMap1.containsKey(6));// false
		System.out.println(treeMap1.get(3));// 我是3

		treeMap1.put(3, "他是3");
		System.out.println(treeMap1.get(3));// 他是3

		treeMap1.remove(3);
		System.out.println(treeMap1.get(3));// null

		System.out.println(treeMap1.firstKey());// 0
		System.out.println(treeMap1.lastKey());// 9
		// <=5 离5最近的key告诉我
		System.out.println(treeMap1.floorKey(5));// 5
		// <=6 离6最近的key告诉我
		System.out.println(treeMap1.floorKey(6));// 5
		// >=5 离5最近的key告诉我
		System.out.println(treeMap1.ceilingKey(5));// 5
		// >=6 离6最近的key告诉我
		System.out.println(treeMap1.ceilingKey(6));// 7
		// O(logN)

		Node node3 = new Node(3);
		Node node4 = new Node(4);
		TreeMap<Node, String> treeMap2 = new TreeMap<>();
		treeMap2.put(node3, "我是node3");// com.yj.nz.hashmap.d1_HashMapAndSortedMap$Node cannot be cast to java.lang.Comparable
		treeMap2.put(node4, "我是node4");//  com.yj.nz.hashmap.d1_HashMapAndSortedMap$Node cannot be cast to java.lang.Comparable

	}

}
