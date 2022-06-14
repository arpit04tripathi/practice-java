package com.a04t.ds.list.singlyLinkedList;

public class SinglyLinkedList {

	SLLNode head;
	int length;

	public SinglyLinkedList() {
	}

	public SinglyLinkedList(SLLNode head) {
		this.head = head;
	}

	public int size() {
		return this.length;
	}

	public SLLNode getHead() {
		return head;
	}

	public void setHead(SLLNode head) {
		this.head = head;
	}

	public SinglyLinkedList addFirst(int data) {
		SLLNode temp = new SLLNode(data);
		if (head == null) {
			this.head = temp;
		} else {
			temp.setNext(head);
			this.head = temp;
		}
		length++;
		return this;
	}

	public SinglyLinkedList addLast(int data) {
		SLLNode last = getLastNode();
		last.setNext(new SLLNode(data));
		return (this);
	}

	public void insertAt(int index, int data) {
		if(index == 0) {
			addFirst(data);
		}else if(index > length) {
			addLast(data);
		}else {
			SLLNode temp = getNodeAt(index-1);
			SLLNode node = new SLLNode(data);
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}

	public void deleteFirst() {
		head = head.getNext();
	}

	public void deleteLast(int data) {

	}
	
	public void deleteAt(int index) {
		SLLNode temp = getNodeAt(index-1);
		temp.next = temp.next.next;
	}

	public SLLNode getLastNode() {
		SLLNode temp = head;
		if(temp == null)
			return null;
		while(temp.getNext() != null)
			temp = temp.getNext();
		return temp;
	}

	public SLLNode getNodeAt(int index) {
		SLLNode temp = head;
		if(temp == null)
			return null;
		for(int i=0; i<index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	public void reverseIterative() {
		if(head == null || head.next == null)
			return;
		SLLNode prev = null;
		SLLNode curr = head;
		SLLNode next = head.next;
		while(curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = curr.next;
		}
		curr.next = prev;
		head = curr;
	}
	
	public void reverseRecursive() {
		reverseRecursive(head);
	}
	
	private void reverseRecursive(SLLNode node) {
		if(isLastNode(node)) {
			head = node;
			return;
		}
		reverseRecursive(node.next);
		SLLNode next = node.next;
		node.next = null;
		next.next = node;
	}

	public void print() {
		SLLNode node = this.head;
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			sb.append(node.getData()).append(" --> ");
			node = node.getNext();
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
	
	public void printRecursive() {
		printForwardRecursive(head);
		printReverseRecursive(head);
		System.out.println("null");
	}

	private void printForwardRecursive(SLLNode node) {
		if(node == null) {
			System.out.println("null");
			return;
		}
		System.out.print(String.format("%d --> ", node.data));
		printForwardRecursive(node.next);
	}
	
	private void printReverseRecursive(SLLNode node) {
		if(node == null) {
			return;
		}
		printReverseRecursive(node.next);
		System.out.print(String.format("%d --> ", node.data));
	}

	private boolean isLastNode(SLLNode node) {
		return node.next == null;
	}
}
