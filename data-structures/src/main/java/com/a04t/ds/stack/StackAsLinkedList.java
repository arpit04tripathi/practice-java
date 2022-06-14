package com.a04t.ds.stack;


import com.a04t.ds.list.singlyLinkedList.SLLNode;

public class StackAsLinkedList {
	SLLNode top;
	
	public StackAsLinkedList push(int data) {
		if(top == null) {
			top = new SLLNode(data);
		} else {
			SLLNode node = new SLLNode(data);
			node.setNext(top);
			top = node;
		}
		return this;
	}
	
	public StackAsLinkedList pop() {
		if(top == null) {
			System.err.println("Error : Empty Stack.");;
		} else {
			top = top.getNext();
		}
		return this;
	}
	
	public SLLNode top() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == null;
	}

	public void print() {
		SLLNode temp = top;
		while(temp !=null) {
			System.out.print(temp.getData() + " --> ");
			temp = temp.getNext();
		}
		System.out.println("null");
	}
}
