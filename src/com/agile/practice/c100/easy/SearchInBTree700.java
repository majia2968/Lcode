package com.agile.practice.c100.easy;

public class SearchInBTree700 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode searchBST(TreeNode root, int val) {
    	if (root == null) return null;
    	if (root.val == val) return root;
    	
    	else if (root.val > val) {
    		return searchBST(root.left, val);
    	}
    	else {
    		return searchBST(root.right, val);
    	}

    }

}
