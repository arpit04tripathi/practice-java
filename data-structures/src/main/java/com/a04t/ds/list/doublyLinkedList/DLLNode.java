package com.a04t.ds.list.doublyLinkedList;

public class DLLNode {
	int data;
	DLLNode prev;
	DLLNode next;
	
	DLLNode(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	
}
