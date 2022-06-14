package com.a04t.ds.stack;

public class StackRunner {

	public static void main(String[] args) {
		
//		runStackAsArray();
		
		runStackAsLinkedList();
	}

	private static void runStackAsLinkedList() {
		StackAsLinkedList stack = new StackAsLinkedList();
		stack.push(5).push(10).push(15).push(20).push(25).push(30).print();
	}

	private static void runStackAsArray() {
		StackAsArray stack = new StackAsArray(5);
		stack.push(5).push(10).push(15).push(20).push(25).push(30).print();
		stack.pop().print();
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		stack.pop().pop().pop().pop().pop().print();
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
	}
}