package com.agile.practice.c100.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeafSimilarTrees872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    	List<Integer> l1 = new Stack<>();
        List<Integer> l2 = new Stack<>();

    	search(root1, l1);
    	search(root1, l2);
    	
        if(l1.size()!=l2.size()) return false;
        for(int i = 0;i < l1.size();i++) {
        	if(l1.get(i) != l2.get(i)) return false;
        }
        return true;

    }
    
    public void search(TreeNode root, List<Integer> ll) {
    	if (root == null) return;
    	if (root.left != null) search(root.left, ll);
    	if (root.right != null) search(root.right, ll);
    	if (root.left == null && root.right == null) ll.add(root.val);
    }

}
