package com.a04t.ds.tree.bst;

public class TreeRunner {

	public static void main(String[] args) {
		int data;
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(80);
		bst.insert(40);
		bst.insert(120);
		bst.insert(20);
		bst.insert(60);
		bst.insert(140);
		bst.insert(100);
		bst.insert(30);
		bst.insert(10);
		bst.insert(70);
		bst.insert(50);
		bst.insert(130);
		bst.insert(90);
		bst.insert(150);
		bst.insert(110);
		data = 40;
		System.out.println(String.format("Search %d : %s", data, bst.search(data)));
		data = 130;
		System.out.println(String.format("Search %d : %s", data, bst.search(data)));
		System.out.println(String.format("Min Iterative : %d", bst.minIterative()));
		System.out.println(String.format("Min Recursive : %d", bst.minRecursive()));
		System.out.println(String.format("Max Iterative : %d", bst.maxIterative()));
		System.out.println(String.format("Max Recursive : %d", bst.maxRecursive()));
		System.out.println(String.format("Height : %d", bst.height()));
		System.out.println("\nBFS Traversal");
		bst.traverseBFS();
		System.out.println("DFS Traversal - Preorder");
		bst.traverseDFSPreorder();
		System.out.println("DFS Traversal - Inorder");
		bst.traverseDFSInorder();
		System.out.println("DFS Traversal - Postorder");
		bst.traverseDFSPostorder();
		System.out.println("Is a BST - " + bst.isBST());
		bst.delete(120);
		bst.traverseBFS();
		data = 70;
		System.out.println(String.format("Inorder Successor of %d is %d", data, bst.inOrderSuccessor(data)));
	}

}
