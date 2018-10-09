package com.agile.practice.c100.tree;

import java.util.ArrayList;
import java.util.List;

public class TwoSumBST653 {
	
	final static int Target = 15;


	public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildBST();
        bt.printTree(node);
		System.out.println(isPairPresent(node));
	}
	
	public static Boolean isPairPresent(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = treeToList(node, list);
		int start = 0;
		int end = list.size()-1;
		while (start < end) {
			if (list.get(start) + list.get(end) == Target) return true;
			if (list.get(start) + list.get(end) > Target) end--;
			if (list.get(start) + list.get(end) < Target) start++;
		}
		return false;
		
	}
	
    // Method that adds values of given BST into ArrayList
    // and hence returns the ArrayList
    public static ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list)
    {     
        if (node == null) return list;         
        treeToList(node.left, list);
        list.add((Integer) node.data);
        treeToList(node.right, list);
        return list;
    }
	
	

}
