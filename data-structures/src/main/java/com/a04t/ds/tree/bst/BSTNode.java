package com.a04t.ds.tree.bst;

public class BSTNode {
	private int data;
	private BSTNode left;
	private BSTNode right;

	public BSTNode(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public BSTNode getLeft() {
		return this.left;
	}

	public BSTNode getRight() {
		return this.right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

}
