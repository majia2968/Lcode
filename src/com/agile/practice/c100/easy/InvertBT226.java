package com.agile.practice.c100.easy;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBT226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
        	Queue<TreeNode> tmp = new LinkedList<>();
        	while (!que.isEmpty()) {
        		TreeNode node = que.poll();
        		if(node.left != null) tmp.add(node.left);
        		if(node.right != null) tmp.add(node.right);
        	}
        }
        return root;
    }

}
