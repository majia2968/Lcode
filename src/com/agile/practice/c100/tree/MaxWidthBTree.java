package com.agile.practice.c100.tree;

public class MaxWidthBTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int widthOfBinaryTree(Node root) {
        if (root == null) return 0;
        if (root.left != null) widthOfBinaryTree(root.left);
        if (root.right != null) widthOfBinaryTree(root.right);
        return 0;
    }

}
