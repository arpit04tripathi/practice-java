package com.a04t.ds.list.runner;

import com.a04t.ds.list.doublyLinkedList.DoublyLinkedList;

public class DoublyLinkedListRunner {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst(50).addFirst(68).addFirst(29).addFirst(23).addLast(99);
		dll.print();
		dll.reversePrint();
	}
}