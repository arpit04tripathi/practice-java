package com.a04t.ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	BSTNode root;

	public BinarySearchTree() {
	}

	public BinarySearchTree(BSTNode root) {
		this.root = root;
	}

	private BSTNode delete(BSTNode root, int data) {
		if (root == null) {
			return null;
		} else if (data < root.getData()) {
			root.setLeft(delete(root.getLeft(), data));
		} else if (data > root.getData()) {
			root.setRight(delete(root.getRight(), data));
		} else {
			if (isLeafNode(root)) {
				// No child
				root = null;
			} else if (root.getLeft() == null) {
				// 1 Child - Right
				root = root.getRight();
			} else if (root.getRight() == null) {
				// 1 Child - Left
				root = root.getLeft();
			} else {
				// 2 Child
				BSTNode min = findMinMaxRecursive(true, root.getRight());
				root.setData(min.getData());
				root.setRight(delete(root.getRight(), min.getData()));
			}
		}
		return root;
	}

	public void delete(int value) {
		this.root = delete(this.root, value);
	}

	private int findMinMaxIterative(boolean minFlag) {
		int result = Integer.MIN_VALUE;
		BSTNode node = this.root;
		if (this.root == null) {
			System.err.println("Error : Tree is empty.");
		} else if (minFlag) {
			while (node.getLeft() != null) {
				node = node.getLeft();
			}
			result = node.getData();
		} else {
			while (node.getRight() != null) {
				node = node.getRight();
			}
			result = node.getData();
		}
		return result;
	}

	private BSTNode findMinMaxRecursive(boolean minFlag, BSTNode node) {
		BSTNode result = null;
		if (node == null) {
			System.err.println("Error : Tree is empty.");
		} else if (minFlag) {
			result = node.getLeft() == null ? node : findMinMaxRecursive(minFlag, node.getLeft());
		} else {
			result = node.getRight() == null ? node : findMinMaxRecursive(minFlag, node.getRight());
		}
		return result;
	}

	public int height() {
		return height(this.root);
	}

	private int height(BSTNode node) {
		int result = -1;
		if (node != null) {
			int leftHeight = height(node.getLeft());
			int rightHeight = height(node.getRight());
//			System.out.println(String.format("%d : leftHeight = %d and rightHeight = %d", node.getData(), leftHeight, rightHeight));
			result = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
		}
		return result;
	}

	private BSTNode inOrderSuccessor(BSTNode root, int data) {
		// O(h) ~ O(log n)
		BSTNode current = search(root, data);
		if (current == null) {
			return null;
		}
		if (current.getRight() != null) {
			return findMinMaxRecursive(true, current.getRight());
		} else {
			BSTNode successor = null;
			BSTNode ancestor = root;
			while (ancestor != null) {
				if (current.getData() < ancestor.getData()) {
					successor = ancestor;
					ancestor = ancestor.getLeft();
				} else {
					ancestor = ancestor.getRight();
				}
			}
			return successor;
		}
	}

	public int inOrderSuccessor(int data) {
		return inOrderSuccessor(this.root, data).getData();
	}

	public BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			BSTNode node = new BSTNode(data);
			System.out.println(String.format("Inserted value = %d", node.getData()));
			return node;
		} else if (data > root.getData()) {
			root.setRight(insert(root.getRight(), data));
		} else {
			root.setLeft(insert(root.getLeft(), data));
		}
		return root;
	}

	public void insert(int data) {
		BSTNode node = insert(this.root, data);
		if (this.root == null) {
			this.root = node;
		}
	}

	public boolean isBST() {

		return isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(BSTNode root, int minValue, int maxValue) {
		if (root == null) {
			return true;
		} else if ((root.getData() > minValue) && (root.getData() < maxValue)
				&& isBST(root.getLeft(), minValue, root.getData())
				&& isBST(root.getRight(), root.getData(), maxValue)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isLeafNode(BSTNode node) {
		return (node == null) || ((node.getLeft() == null) && (node.getRight() == null));
	}

	public int maxIterative() {
		return findMinMaxIterative(false);
	}

	public int maxRecursive() {
		BSTNode node = findMinMaxRecursive(false, this.root);
		return node.getData();
	}

	public int minIterative() {
		return findMinMaxIterative(true);
	}

	public int minRecursive() {
		BSTNode node = findMinMaxRecursive(true, this.root);
		return node.getData();
	}

	public BSTNode search(BSTNode root, int data) {
		if (root == null) {
			return null;
		} else if (root.getData() == data) {
			return root;
		} else if (data > root.getData()) {
			return search(root.getRight(), data);
		} else {
			return search(root.getLeft(), data);
		}
	}

	public boolean search(int data) {
		return (search(this.root, data) == null ? false : true);
	}

	public void traverseBFS() {
		if (this.root == null) {
			System.err.println("Error : Tree is empty.");
			return;
		}
		Queue<BSTNode> queue = new LinkedList<>();
		queue.add(this.root);
		queue.add(null);
		while (!queue.isEmpty()) {
			if (queue.peek() == null) {
				queue.poll();
				if (!queue.isEmpty()) {
					queue.add(null);
				}
				System.out.println();
			} else {
				BSTNode node = queue.poll();
				System.out.print(node.getData() + "<-- ");
				if (node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				if (node.getRight() != null) {
					queue.add(node.getRight());
				}
			}
		}

	}

	public void traverseDFSInorder() {
		traverseDFSInorder(this.root);
		System.out.println("null");
	}

	private void traverseDFSInorder(BSTNode root) {
		if (root == null) {
			return;
		}
		traverseDFSInorder(root.getLeft());
		System.out.print(String.format("%s --> ", root.getData()));
		traverseDFSInorder(root.getRight());
	}

	public void traverseDFSPostorder() {
		traverseDFSPostorder(this.root);
		System.out.println("null");
	}

	private void traverseDFSPostorder(BSTNode root) {
		if (root == null) {
			return;
		}
		traverseDFSPostorder(root.getLeft());
		traverseDFSPostorder(root.getRight());
		System.out.print(String.format("%s --> ", root.getData()));
	}

	public void traverseDFSPreorder() {
		traverseDFSPreorder(this.root);
		System.out.println("null");
	}

	private void traverseDFSPreorder(BSTNode root) {
		if (root == null) {
			return;
		}
		System.out.print(String.format("%s --> ", root.getData()));
		traverseDFSPreorder(root.getLeft());
		traverseDFSPreorder(root.getRight());
	}
}
