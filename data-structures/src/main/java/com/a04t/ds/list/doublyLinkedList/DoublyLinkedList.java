package com.a04t.ds.list.doublyLinkedList;

public class DoublyLinkedList {
	DLLNode head;
	
	public DoublyLinkedList addFirst(int data) {
		if(isEmpty()) {
			head = new DLLNode(data);
			return (this);
		}
		DLLNode node = new DLLNode(data);
		node.next = head;
		head = node;
		return (this);
	}
	
	public DoublyLinkedList addLast(int data) {
		if(isEmpty()) {
			head = new DLLNode(data);
			return (this);
		}
		DLLNode node = getLastNode();
		node.next = new DLLNode(data);
		return (this);
	}
	
	private DLLNode getLastNode() {
		DLLNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public void print() {
		DLLNode temp = head;
		while(temp != null) {
			System.out.print(String.format("%d --> ", temp.data));
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void reversePrint() {
		reversePrintRecursive(head);
		System.out.println("null");
	}
	
	private void reversePrintRecursive(DLLNode node) {
		if(node == null) {
			return;
		}
		reversePrintRecursive(node.next);
		System.out.print(String.format("%d --> ", node.data));
	}

	private boolean isEmpty() {
		return (this.head == null);
	}
}
