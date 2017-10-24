package com.agile.practice.c100;

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
        root.right.left = new Node(21);
        root.right.right = new Node(18);
        root.right.right.right = new Node(13);
        return root;
    }

    public static void printTree(Node root) {
        BTreePrinter.printNode(root);
    }

}
