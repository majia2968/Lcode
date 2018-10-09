package com.agile.practice.c100.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RowToBT623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(addOneRow(node, 1, 3));
        bt.printTree(node);
	}
	
    public static Node addOneRow(Node root, int v, int d) {
    	if (root == null) return null;
    	Queue<Node> que = new LinkedList<Node>();
    	que.add(root);
    	int i = 1;
    	while(!que.isEmpty()) {
    		int count = que.size();
    		Queue<Node> tmp = new LinkedList<Node>();
    		while (count-- > 0) {
    			Node node = que.remove();
    			if (node.left != null) tmp.add(node.left);
    			if (node.right != null) tmp.add(node.right);
    			if (i == d-1) {
    				Node nl = new Node(v);
    				Node nr = new Node(v);
    			    nl.left = node.left;
    			    nr.right = node.right;
    				node.left = nl;
    				node.right = nr;
    			}
    		}
    		que = tmp;
    		i++;
    	}
        return root;
    }

}
