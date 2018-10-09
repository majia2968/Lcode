package com.agile.practice.c100.easy;

public class MaxDepBT104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lp = maxDepth(root.left);
        int rp = maxDepth(root.right);
        return lp > rp ? lp+1 : rp + 1;
    }

}
