package com.a04t.ds.list.singlyLinkedList;

public class SLLNode {

	int data;
	SLLNode next;
	
	public SLLNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SLLNode getNext() {
		return next;
	}
	public void setNext(SLLNode next) {
		this.next = next;
	}
}