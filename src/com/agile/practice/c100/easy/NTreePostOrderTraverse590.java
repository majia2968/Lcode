package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.List;

public class NTreePostOrderTraverse590 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> postorder(Node root) {
    	List<Integer> arr = new ArrayList<Integer>();
    	traverseTree(root, arr);
    	return arr;
    }
    
    public void traverseTree(Node root, List<Integer> arr) {
    	if (root == null) return;
    	for (Node node : root.children)	{
    		traverseTree(node, arr);
    	}
    	arr.add(root.val);
    }

}

