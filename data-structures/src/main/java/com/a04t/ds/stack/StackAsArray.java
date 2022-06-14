package com.a04t.ds.stack;

public class StackAsArray {
	
	private static final String ERR_EMPTY = "Error : Empty Stack.";
	private static final String ERR_OVERFLOW = "Error : Stack Overflow.";
	private static final String ERR_UNDERFLOW = "Error : Stack Underflow.";
	
	int[] stack;
	int top = -1;

	public StackAsArray(int size) {
		stack = new int[size];
	}

	public StackAsArray push(int data) {
		if (top == stack.length - 1) {
			System.out.println(ERR_OVERFLOW);
		} else {
			stack[++top] = data;
		}
		return (this);
	}

	public StackAsArray pop() {
		if (isEmpty()) {
			System.out.println(ERR_UNDERFLOW);
		} else {
			top--;
		}
		return this;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int top() {
		if (isEmpty()) {
			System.out.println(ERR_EMPTY);
			return Integer.MIN_VALUE;
		}
		return stack[top];
	}

	public void print() {
		if (isEmpty()) {
			System.out.println(ERR_EMPTY);
		} else {
			for (int i = 0; i <= top; i++)
				System.out.print(String.format("%d <-- ", stack[i]));
			System.out.println("top");
		}
	}
}
