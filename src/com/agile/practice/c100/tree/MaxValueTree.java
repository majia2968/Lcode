package com.agile.practice.c100.tree;

public class MaxValueTree {

    public static void main(String[] args) {
        Bst bt = new Bst();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(findMax(node));
        System.out.println(findMin(node));
    }

    public static int findMax(Node node) {
        if (node == null) return Integer.MIN_VALUE;
        int max = (int) node.data;
        int lMax = findMax(node.left);
        int rMax = findMax(node.right);
        return Math.max(max, Math.max(lMax, rMax));
    }

    public static int findMin(Node node) {
        if (node == null) return Integer.MAX_VALUE;
        int max = (int) node.data;
        int lMin = findMin(node.left);
        int rMin = findMin(node.right);
        return Math.min(max, Math.min(lMin, rMin));
    }


}
