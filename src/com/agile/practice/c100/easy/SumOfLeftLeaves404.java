package com.agile.practice.c100.easy;

public class SumOfLeftLeaves404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null) sumOfLeftLeaves(root.left);
        if (root.right != null) sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;
        return sum;
        
    }

}
