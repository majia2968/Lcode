package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgBST637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ll = new ArrayList<Double>();
        if (root == null) return ll;
        int h = height(root);
        for (int i = 1; i <= h; i++) {
        	List<Integer> tmp = new ArrayList<Integer>();
        	if (i == 1) {
        		ll.add((double) root.val);
        	}
        	else {
        		traverseLevel(root, i, tmp);
                if (tmp.size() > 1){
                    ll.add(tmp.stream().mapToDouble(a -> a).sum()/tmp.size());
                }
                else {
                    ll.add(tmp.stream().mapToDouble(a -> a).sum());
                }
        	}
        	
        }
        return ll;
    }
    
        
    public int height(TreeNode root) {
    	if (root == null) return 0;
    	int ls = height(root.left);
    	int rs = height(root.right);
    	return ls > rs ? ls + 1 : rs + 1;
    }
    
    public void traverseLevel(TreeNode root, int level, List<Integer> ll) {
    	if (root == null) return;
    	if (level == 1) {
    		ll.add(root.val);
    	}
    	else {
    		if (root.left != null) traverseLevel(root.left, level-1, ll);
    		if (root.right != null) traverseLevel(root.right, level-1, ll);
    	}
    	
    }
    
    public List<Double> averageOfLevel(TreeNode root) {
    	List<Double> res = new ArrayList<>();
    	Queue<TreeNode> que = new LinkedList<>(); 
    	que.offer(root);
    	while (!que.isEmpty()) {
    		double sum = 0;
    		int size = que.size();
    		for (int i = 0; i < size; i++ ) {
    			TreeNode node = que.poll();
    			sum += node.val; 
    			if (node.left != null) que.offer(node.left);
    			if (node.right != null) que.offer(node.right);
    		}
    		res.add(sum/size);
    	}
    	return res;
    }

}
