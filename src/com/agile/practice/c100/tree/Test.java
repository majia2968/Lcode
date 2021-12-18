package com.agile.practice.c100.tree;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Bst  bt = new Bst();
        Node node = bt.buildEasyTree();
        int sum = sumOfLeaves(node);
        bt.printTree(node);
        System.out.println(sum);
        int max = maxNode(node);
        System.out.println(max);
    }

    public static int sumOfLeaves(Node<Integer> root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.data + sumOfLeaves(root.left) + sumOfLeaves(root.right);
        return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }

    public static int maxNode(Node<Integer> root) {
        if (root == null) return 0;
        int max = Integer.MIN_VALUE;
        max = Math.max(max, root.data);
        int leftV = maxNode(root.left);
        int rightV = maxNode(root.right);
        return Math.max(Math.max(max, leftV), rightV);
    }
}
