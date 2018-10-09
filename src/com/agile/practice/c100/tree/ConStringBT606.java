package com.agile.practice.c100.tree;

public class ConStringBT606 {

	public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(tree2str(node));
	}
	
    public static String tree2str(Node node) {
        if(node==null)
            return "";
        if(node.left==null && node.right==null)
            return node.data + "";
        if(node.right == null)
        	return node.data+"("+tree2str(node.left) + ")";
        return node.data +  "(" + tree2str(node.left) + ")" + "(" + tree2str(node.right) + ")";
    }

}
