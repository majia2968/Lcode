package com.agile.practice.c100.tree;

public class GreaterBT538 {
	private static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        convertBST(node);
        bt.printTree(node);
	}
	
	public static Node<Integer> convertBST(Node<Integer> root) {
		if (root == null) return null;
		convertBST(root.left);
        sum += root.data;
        root.data = sum;
		convertBST(root.right);
        return root;  
    }

}
