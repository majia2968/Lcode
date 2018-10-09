package com.agile.practice.c100.tree;

import java.util.*;

public class BinaryTree {

    public BinaryTree() {

    }

    public static Node buildTree() {
        Node root = new Node(8);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.left.right.right = new Node(15);
        root.right.left = new Node(21);
        root.right.right = new Node(18);
        root.right.right.left = new Node(13);
        //root.right.right.right = new Node(13);
        return root;
    }
    
    public static Node buildBST() {
        Node root = new Node(11);
        root.left = new Node(8);
        root.right = new Node(20);
        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.right.left = new Node(12);
        root.right.right = new Node(21);
        root.right.right.right = new Node(23);
        return root;
    }

    public static void printTree(Node root) {
        BTreePrinter.printNode(root);
    }
    
    public static String subTree(Node root, Map<String, List<Node>> map) {
    	if (root == null) return "";    	
    	String s = subTree(root.left, map) + root + subTree(root.right, map);
    	if (!map.containsKey(s)) map.put(s, new ArrayList<Node>());
    	map.get(s).add(root);
    	return s;
    }

}
