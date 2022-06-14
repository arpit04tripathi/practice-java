package com.a04t.ds.list.runner;

import com.a04t.ds.list.singlyLinkedList.SinglyLinkedList;

public class SinglyLinkedListRunner {
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addFirst(20).addFirst(50).addFirst(18).addLast(99).print();
		sll.deleteFirst();
		sll.print();
		System.out.println(String.format("SLL length is %d", sll.size()));
		System.out.println(String.format("Last Node Value is %d", sll.getLastNode().getData()));
		System.out.println(String.format("Node Value at index %d is %d", 1, sll.getNodeAt(1).getData()));
		sll.insertAt(2, 85);
		sll.insertAt(3, 67);
		sll.print();
		sll.deleteAt(2);
		sll.print();
		sll.reverseIterative();
		sll.print();
		sll.printRecursive();
		sll.print();
		sll.reverseRecursive();
		sll.print();
	}
}
