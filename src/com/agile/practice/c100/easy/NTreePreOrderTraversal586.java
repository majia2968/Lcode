package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.List;

public class NTreePreOrderTraversal586 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> preorder(Node root) {
        List<Integer> arr = new ArrayList<Integer>();
        traverseTree(root, arr);
        return arr;
    }
    
    public void traverseTree(Node node, List<Integer> arr) {
    	if (node == null) return;
    	arr.add(node.val);
    	for (Node n : node.children) {
    		traverseTree(n, arr);
    	}
    }

}
