package com.agile.practice.c100.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvLevsBT637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(averageOfLevels(node).toString());

	}
	
	//BFS to find levels
    public static List<Double> averageOfLevels(Node root) {
    	List<Double> res = new ArrayList<Double>();
        List<Double> list = new ArrayList<Double>();
        if (root == null) return null;
        Queue que = new LinkedList<Node>();
        que.add(root);
        while (!que.isEmpty()) {
        	Integer sum = 0;
        	Queue tmp = new LinkedList<Node>();
        	int c = que.size();
        	int count = que.size();
        	while (count-- > 0) {
        		Node node = (Node) que.remove();
        		sum += (Integer) node.data;
        		if (node.left != null) tmp.add(node.left);
        		if (node.right != null) tmp.add(node.right);
        	}
        	que = tmp;
        	res.add(sum * 1.0 / c);
        }
        return res;
    }

}
