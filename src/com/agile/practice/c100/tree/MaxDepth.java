package com.agile.practice.c100.tree;

import java.util.HashMap;
import java.util.Map;

public class MaxDepth {

    public static void main(String[] args) {
        Bst bt = new Bst();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(maxDepth(node));
        System.out.println(max(node));
        System.out.println(fab(11));
    }

    public static int maxDepth(Node root) {
        if (root == null) return 0;
        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);
        return lt > rt ? lt + 1 : rt +1;
    }

    public static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        int ls = max(root.left);
        int rs = max(root.right);
        return Math.max(Math.max(ls, (int)root.data), rs);
    }
    public static Map<Integer, Integer> map = new HashMap<>();

    public static int fab(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (map.containsKey(n)) return map.get(n);
        int v = fab(n-1) + fab(n-2);
        map.put(n, v);
        return v;
    }

}
