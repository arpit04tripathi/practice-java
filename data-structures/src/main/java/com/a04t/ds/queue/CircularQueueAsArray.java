package com.a04t.ds.queue;

public class CircularQueueAsArray {
	int[] arr;
	int front = -1;
	int rear = -1;
	
	public CircularQueueAsArray(int size) {
		arr = new int[size];
	}

	public boolean isEmpty() {
		return (front==-1 && rear==-1);
	}

	private boolean isFull() {
		return (front == ((rear+1)%arr.length));
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.err.println("Error : Queue is full");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
			arr[front]=item;
		}else {
			incrementRear();
			arr[rear]=item;
		}
	}
	
	private int incrementRear() {
		rear++;
		rear = rear % arr.length;
		return rear;
	}
	
	private int incrementFront() {
		front++;
		front = front % arr.length;
		return front;
	}

	public int dequeue() {
		int value = arr[0];
		if(isEmpty()) {
			System.err.println("Error : Queue is Empty.");
		} else if(front == rear && front == 0) {
			value = arr[front];
			front = rear = -1;
		}else {
			value = arr[front];
			incrementFront();
		}
		return value;
	}
	
	public void print() {
		StringBuilder sb = new StringBuilder("queue : ");
		int end = (rear>front) ? rear : rear+arr.length;
		for(int i=front ; i<=end; i++)
			sb.append(String.format("%d <-- ", arr[i%arr.length]));
		System.out.println(sb.toString());
	}
}
