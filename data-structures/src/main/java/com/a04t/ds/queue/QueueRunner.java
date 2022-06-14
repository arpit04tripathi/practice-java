package com.a04t.ds.queue;

public class QueueRunner {

	public static void main(String[] args) {

		runQueueAsArray();
		runCircularQueueAsArray();
		runQueueAsLinkedList();
	}

	private static void runCircularQueueAsArray() {
		CircularQueueAsArray q = new CircularQueueAsArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.print();
		q.dequeue();
		q.enqueue(60);
		q.print();
	}

	private static void runQueueAsArray() {
		QueueAsArray q = new QueueAsArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.print();
		q.dequeue();
		q.enqueue(60);
		q.print();
	}

	private static void runQueueAsLinkedList() {
		QueueAsLinkedList q = new QueueAsLinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.print();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.print();
	}

}
