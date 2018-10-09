package com.agile.practice.c100.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NtreeTravese429 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> levelOrder(Node root) {
    	if (root == null) return new ArrayList<>();;
    	Queue<Node> que = new LinkedList<Node>();
    	que.offer(root);
    	List<List<Integer>> re = new ArrayList<>();
    	while (!que.isEmpty())	{
    		Queue<Node> tmp = new LinkedList<Node>();
    		List<Integer> temp = new ArrayList<>();
    		while (!que.isEmpty()) {
    			Node node = que.poll();
    			temp.add(node.val);
    			List<Node > ll = node.children;
    			for (Node n : ll) {
    				tmp.add(n);
    			}
    		}
    		que = tmp;
    		re.add(temp);
    	}
    	return re;
    }

}
