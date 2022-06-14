package com.a04t.ds.stack;

import com.a04t.ds.list.singlyLinkedList.SLLNode;
import com.a04t.ds.list.singlyLinkedList.SinglyLinkedList;

public class ReverseLinkedListWithStack {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList(new SLLNode(10));
		list.addLast(20).addLast(30).addLast(40).print();
		StackAsLinkedList stack = new StackAsLinkedList();
		SLLNode temp = list.getHead();
		while(temp != null) {
			stack.push(temp.getData());
			temp = temp.getNext();
		}
		list.setHead(stack.top());
		temp = stack.top();
		while(!stack.isEmpty()) {
			stack.pop();
			temp.setNext(stack.top());
			temp = stack.top();
		}
		list.print();
	}
}
