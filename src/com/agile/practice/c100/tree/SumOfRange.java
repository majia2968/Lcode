package com.agile.practice.c100.tree;

public class SumOfRange {

    public static void main(String[] args) {
        Bst bt = new Bst();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(sumOfRangeTree(node, 0, 10));
    }

    public static int sumOfRangeTree(Node node, int low, int high) {
        if (node == null) return 0;
        int sum = 0;
        int val = (int)node.data;
        if (val >= low && val <= high) sum += val;
        int lv = sumOfRangeTree(node.left, low, high);
        int rv = sumOfRangeTree(node.right, low, high);
        return sum + lv + rv;

    }
}
