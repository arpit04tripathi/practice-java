package com.a04t.ds.queue;

import list.singlyLinkedList.SLLNode;

public class QueueAsLinkedList {

	SLLNode front;
	SLLNode rear;

	public int dequeue() {
		int result = Integer.MIN_VALUE;
		if (isEmpty()) {
			System.err.println("Error : Queue is Empty.");
		} else if (this.front == this.rear) {
			result = this.front.getData();
			this.front = this.rear = null;
		} else {
			result = this.front.getData();
			SLLNode node = this.front.getNext();
			this.front.setNext(null);
			this.front = node;
		}
		return result;
	}

	public void enqueue(int item) {
		if (isEmpty()) {
			this.front = new SLLNode(item);
			this.rear = this.front;
		} else {
			SLLNode node = new SLLNode(item);
			this.rear.setNext(node);
			this.rear = node;
		}
	}

	public boolean isEmpty() {
		return (this.front == null) && (this.rear == null);
	}

	public void print() {
		StringBuilder sb = new StringBuilder("queue : ");
		SLLNode node = this.front;
		while (node != null) {
			sb.append(String.format("%d <-- ", node.getData()));
			node = node.getNext();
		}
		System.out.println(sb.toString());
	}
}
