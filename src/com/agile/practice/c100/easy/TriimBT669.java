package com.agile.practice.c100.easy;

public class TriimBT669 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) { return null; }
        TreeNode node = root; 
        if (node.val < L) { 
            return trimBST(node.right, L, R); 
        } else if (node.val > R) {
            return trimBST(node.left, L, R);
        }
        node.left = trimBST(node.left, L, R);
        node.right = trimBST(node.right, L, R);
        return node;
    }

}
