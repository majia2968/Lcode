package com.agile.practice.c100.easy;

public class MaxValueBST {

    public static void main(String[] args) {

    }

    public static int maxTree(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        int tmp = root.val;
        int left = maxTree(root.left);
        int right = maxTree(root.right);
        return Math.max(tmp, Math.max(left, right));
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null || root.val==val) return root;
        if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    public static int SumRangeBST(TreeNode root, int L, int R) {
        if (root==null) return 0;
        if (root.val >= L && root.val <= R) {
            return root.val + SumRangeBST(root.left, L, R) + SumRangeBST(root.right, L, R);
        }
        else if (root.val < L)
        return SumRangeBST(root.right, L, R);
        else return SumRangeBST(root.left, L, R);
    }
}
