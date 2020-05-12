package com.agile.practice.c100.easy;

import java.util.List;

public class MaxDepth559 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxDepth(Node root) {
        if (root == null) {
        	return 0;
        }
        else {
        	int max = 0;
        	for (Node child : root.children) {
        		max = Math.max(max, maxDepth(child));
        	}
        	return max+1;
        }       
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
