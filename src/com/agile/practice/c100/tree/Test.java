package com.agile.practice.c100.tree;

public class Test {

    public static void main(String[] args) {
        Bst  bt = new Bst();
        Node node = bt.buildTree();
        int sum = sumOfLeaves(node);
        System.out.print(sum);
    }

    public static int sumOfLeaves(Node<Integer> root) {
        if (root == null) return 0;
        return root.data + sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }
}
