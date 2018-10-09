package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.List;

public class IncreaseOrderBT897 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		TreeNode newNode = new TreeNode(0);
		TreeNode cur = newNode;
		inorder(root, arr);
		for (int i = 0; i < arr.size(); i++) {
			cur.left = null;
			cur.right = new TreeNode(i);
			cur = cur.right;
		}
		return newNode.right;
    }
	
	public void inorder(TreeNode root, List<Integer> arr) {
		if (root == null) return;
		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);
	}



}
