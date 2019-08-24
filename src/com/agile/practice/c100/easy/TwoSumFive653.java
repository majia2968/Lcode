package com.agile.practice.c100.easy;

import java.util.HashSet;
import java.util.Set;

public class TwoSumFive653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        return help(root, k, set);
        
    }
    
    public boolean help(TreeNode root, int k, Set<Integer> set) {
        if (root == null) return false;
        if (set.contains(k-root.val)) return true;
        set.add(root.val);
        return help(root.left, k, set) || help(root.right, k, set);
    }

}
