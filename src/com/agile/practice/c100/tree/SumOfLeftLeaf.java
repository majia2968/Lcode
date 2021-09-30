package com.agile.practice.c100.tree;

public class SumOfLeftLeaf {

    public static void main(String[] args) {
        Bst bt = new Bst();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(sumOfLeftLeaves(node));

    }

    public static int sumOfLeftLeaves(Node root) {
        int sum = 0;
        if (root == null) return 0;
        if (root != null) {
            if (isLeaf(root.left)) sum += (int) root.left.data;
            else sum += sumOfLeftLeaves(root.left);
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }

    public static boolean isLeaf(Node node) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return true;
        return false;
    }

}
