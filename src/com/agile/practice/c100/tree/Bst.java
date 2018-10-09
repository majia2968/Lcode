package com.agile.practice.c100.tree;

public class Bst {
	
    public Bst() {

    }

    public static Node buildTree() {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.left.left = new Node(10);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(14);
        root.right.right.right = new Node(16);
        return root;
    }

    public static void printTree(Node root) {
        BTreePrinter.printNode(root);
    }

}
