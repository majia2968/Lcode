package com.agile.practice.c100;


import static java.lang.Math.max;

public class LongestUniValuePath678 {

    private int ans;

    public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node root = bt.buildTree();
        LongestUniValuePath678 tree = new LongestUniValuePath678();
        tree.findLongestUniValuePath(root);
        bt.printTree(root);
        System.out.println(tree.ans);

    }

    public int findLongestUniValuePath(Node root) {
        if (root == null) return 0;
        int l = findLongestUniValuePath(root.left);
        int r = findLongestUniValuePath(root.right);
        int pl = 0;
        int pr = 0;
        if (root.left != null && root.data == root.left.data) pl = l + 1;
        if (root.right != null && root.data == root.right.data) pr = r + 1;
        this.ans = Math.max(this.ans, pl + pr);
        return Math.max(pl, pr);
    }
}
