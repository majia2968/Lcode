package com.agile.practice.c100.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomLeftBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(findBottomLeftValue(node));
        String a = "abc";
        String b = "abc";
        
        
        System.out.println(a==b);
        System.out.println(new String("abc") == new String("abc"));
        

	}
	private static List<Integer> list = new ArrayList<Integer>();

    public static List<Integer> findBottomLeftValue(Node<Integer> root) {
    	if (root == null) return null;
    	Queue<Node<Integer>> que = new LinkedList<Node<Integer>>();
    	que.add(root);
    	list.add(root.data);
    	while (!que.isEmpty()) {
    		int count = que.size();
    		int sum = 0;
        	Queue<Node<Integer>> tmp = new LinkedList<Node<Integer>>();
        	Queue<Node<Integer>> temp = new LinkedList<Node<Integer>>();
        	while (count-- > 0) {
        		Node<Integer> node = que.remove();
        		if (node.left != null) {
        			tmp.add(node.left);
        			temp.add(node.left);
        		}
        		if (node.right != null) tmp.add(node.right);
        	}
        	if (!tmp.isEmpty()) list.add(temp.remove().data);
        	que = tmp;
    	}
    	
        return list;
    }

}
