package com.agile.practice.c100.easy;

public class MinTreeNode783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int t = Integer.MAX_VALUE;
	public int pre = Integer.MAX_VALUE;
	
    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;
       
        minDiffInBST(root.left);
        if (pre != Integer.MAX_VALUE) t = Math.min(t, Math.abs(root.val - pre));
        pre = root.val;
        minDiffInBST(root.right);
        return t;
    }
    public int lon = Integer.MIN_VALUE;
    
    public int res = 0;
    public int longestUnivaluePath(TreeNode root) {
    	if (root == null) return 0;
    	int leftCount = longestUnivaluePath(root.left);
    	int rightCount = longestUnivaluePath(root.right);
    	int left = 0, right = 0;
    	
    	if (root.left != null && root.left.val == root.val) left = leftCount + 1;
    	if (root.right != null && root.right.val == root.val) right = rightCount + 1;
    	res = Math.max(res, left+right);
    	return res;
    }
    
//    public List<TreeNode> allPossibleFBT(int N) {
//        for (int i = 7; i < N; i++) {
//        	if ()
//        }
//    }

}
