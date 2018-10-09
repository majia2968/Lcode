package com.agile.practice.c100.tree;

public class DiameterBT543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(diameterOfBinaryTree(node));
	}
	
    public static int diameterOfBinaryTree(Node root) {
    	if (root == null) return 0;
    	int left = hight(root.left);
    	int right = hight(root.right);
    	int ld = diameterOfBinaryTree(root.left);
    	int rd = diameterOfBinaryTree(root.right);
    	return Math.max(left + right + 1, Math.max(ld, rd));
    }
    
    public static int hight(Node root) {
    	if (root == null) return 0;
    	int left = hight(root.left) + 1;
    	int right = hight(root.right) + 1;
    	return Math.max(left, right);
    }

}
