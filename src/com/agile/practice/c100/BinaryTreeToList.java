package com.agile.practice.c100;

public class BinaryTreeToList {
	
	public static void main(String[] args) {
		Node root = new Node(9);
		root.left = new Node(11);
		root.right = new Node(6);
		root.left.left = new Node(14);
		root.right.left = new Node(3);
		root.left.right = new Node(21);
		root.right.right = new Node(16);
		root.right.right.left = new Node(156);
 		Node node = new BinaryTreeToList().treeToListOne(root);
		while (node.right != null) {
			System.out.println(node.val);
			node = node.right;
		}
		System.out.println(node.val);
	}
	
	public Node treeToListOne(Node root) {
		Node node = treeToList(root);
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
	
	public Node treeToList(Node root) {
		if (root == null) return null;
		if (root.left != null) {
			Node left = treeToList(root.left);
			while (left.right != null) {
				left = left.right;
			}
			left.right = root;
			root.left = left;
		}
		if (root.right != null) {
			Node right = treeToList(root.right);
			while (right.left != null) {
				right = right.left;
			}
			right.left = root;
			root.right = right;
		}
		return root;
	}

}

class Node {
	int val;
	Node left;
	Node right;
	
	Node(int val) {
		this.val = val;
	}
	
}
