package com.agile.practice.c100.easy;

public class GreatTreeBT538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        if (root.right != null) convertBST(root.right);
        sum += root.val;
        root.val = sum;
        if (root.left != null) convertBST(root.left);
        return root;      
    }
    


}
