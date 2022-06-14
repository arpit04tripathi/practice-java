package com.a04t.ds.arrays.dynamicList;

import java.util.Arrays;

public class ArrayAsDynamicList {

	private int[] arr;
	private int index;
	private int maxSize;

	ArrayAsDynamicList(int maxSize) {
		this.maxSize = maxSize;
		this.arr = new int[maxSize];
	}

	public static void main(String[] args) {
		ArrayAsDynamicList array = new ArrayAsDynamicList(20);
		array.insert(25);
		array.insert(20);
		array.print();
		System.out.println("Completed");
	}

	private void print() {
		System.out.println(Arrays.toString(this.arr));
	}

	public int size() {
		return index;
	}

	public boolean insert(int item) {
		if (index < maxSize) {
			arr[index++] = item;
		}
		return true;
	}

	public boolean insert(int index, int item) {

		return true;
	}
}
