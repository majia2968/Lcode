package com.agile.practice.c100.tree;

public class SerializationTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(11);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(14);
		root.right.left = new TreeNode(3);
		root.left.right = new TreeNode(21);
		root.right.right = new TreeNode(16);
		
		System.out.println(new SerializationTree().sort(root));
		System.out.println(new SerializationTree().serializeTree(root));
		
	}
	
	public String serializeTree(TreeNode node) {
		StringBuilder sb = new StringBuilder();
		serialize(sb, node);
		return sb.toString();
	}
	
	public void serialize(StringBuilder sb, TreeNode node) {
		if (node == null) {
			sb.append("#");
		}
		else {
			sb.append(node.val);
			serialize(sb, node.left);
			serialize(sb, node.right);
		}
	}
	int max = 0;
	public int sort(TreeNode root) {
		if (root.val > max) max = root.val;
		if (root.left == null || root.right == null) return max;
		sort(root.left);
		sort(root.right);
		return max;
	}
	
	public void deSerializeTree() {
		
	}

}

class TreeNode {
	TreeNode left, right;
	int val;
	
	TreeNode(int val) {
		this.val = val;
	}
}
