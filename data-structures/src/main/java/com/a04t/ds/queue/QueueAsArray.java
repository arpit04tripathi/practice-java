package com.a04t.ds.queue;

public class QueueAsArray {
	int[] arr;
	int front = -1;
	int rear = -1;

	public QueueAsArray(int size) {
		this.arr = new int[size];
	}

	public int dequeue() {
		int value = this.arr[0];
		if (isEmpty()) {
			System.err.println("Error : Queue is Empty.");
		} else if ((this.front == this.rear) && (this.front == 0)) {
			value = this.arr[this.front];
			this.front = this.rear = -1;
		} else {
			value = this.arr[this.front++];
		}
		return value;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.err.println("Error : Queue is full");
			return;
		}
		if (isEmpty()) {
			this.front = this.rear = 0;
			this.arr[this.front] = item;
		} else {
			this.arr[++this.rear] = item;
		}
	}

	public boolean isEmpty() {
		return ((this.front == -1) && (this.rear == -1));
	}

	private boolean isFull() {
		return this.rear == (this.arr.length - 1);
	}

	public void print() {
		StringBuilder sb = new StringBuilder("queue : ");
		for (int i = this.front; i <= this.rear; i++) {
			sb.append(String.format("%d <-- ", this.arr[i]));
		}
		System.out.println(sb.toString());
	}
}
