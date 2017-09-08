package com.agile.practice.c100;

public class MergeBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode node1 = new TNode(1);
		node1.left = new TNode(1);
		node1.right = new TNode(1);
		node1.left.left = new TNode(1);
		node1.left.right = new TNode(1);
		node1.right.left = new TNode(1);
		node1.right.right = new TNode(1);
		
		TNode node2 = new TNode(2);
		node2.left = new TNode(2);
		node2.right = new TNode(2);
		node2.left.left = new TNode(2);
		node2.left.right = new TNode(2);
		node2.right.left = new TNode(2);
		node2.right.right = new TNode(2);
		
		
	}
	
	public static TNode mergeBinaryTree(TNode n1, TNode n2) {
		
		if (n1 == null && n2 == null) return null;
		int val = (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n1.val);
		TNode newNode = new TNode(val);
		newNode.left = mergeBinaryTree((n1 == null ? null : n1.left), (n2 == null ? null : n2.left));
		newNode.right = mergeBinaryTree((n1 == null ? null : n1.right), (n2 == null ? null : n2.right));

		return newNode;

	}

}