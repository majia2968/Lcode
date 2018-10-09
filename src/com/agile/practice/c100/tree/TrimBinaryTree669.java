package com.agile.practice.c100.tree;

public class TrimBinaryTree669 {
	
	public static void main(String[] args) {
        Bst  bt = new Bst();
        Node node = bt.buildTree();
		Node root = trimBST(node, 8, 14);
		bt.printTree(root);
	}
	
    public static Node trimBST(Node root, int L, int R) {
    	if (root == null) return null;
    	if ((Integer) root.data < L) return trimBST(root.left, L, R);
    	if ((Integer) root.data > R) return trimBST(root.right, L, R);
    	root.left = trimBST(root.left, L, R);
    	root.right = trimBST(root.right, L, R);
        return root;
    }

}
