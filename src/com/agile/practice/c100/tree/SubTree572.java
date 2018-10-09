package com.agile.practice.c100.tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubTree572 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
    	Node t = new Node(10);
    	t.left = new Node(21);
    	t.right = new Node(18);
        bt.printTree(node);
        System.out.println(toString(t));
        System.out.println(isSubtree(node, t));
	}
	
    public static boolean isSubtree(Node s, Node t) {
    	Set<String> set = new HashSet<String>();
    	serialize(s, set);
    	String ss = toString(t);
    	for (String sc : set) {
    		System.out.println(sc);
    		if (sc.contains(ss)) return true;
    	}
    	
    	return false;
    }
    
    public static String serialize(Node node, Set set) {
    	if (node == null) return "";
        String s = serialize(node.left, set) + node.data + serialize(node.right, set) ;
        if (!set.contains(s)) set.add(s);
        return s;
    }

    public static String toString(Node node) {
    	if (node == null) return "";
    	return toString(node.left) + node.data + toString(node.right);
    }
    
}
