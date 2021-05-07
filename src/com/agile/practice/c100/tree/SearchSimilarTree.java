package com.agile.practice.c100.tree;
import java.util.*;

public class SearchSimilarTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean leafSimilar(TNode root1, TNode root2) {
        List<Integer> l1 = new Stack<>();
        List<Integer> l2 = new Stack<>();
        searchTree(root1, l1);
        searchTree(root2, l2);
        if (l1.size() != l2.size()) return false;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != l2.get(i)) return false;
        }
        return true;
    }

    public static void searchTree(TNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) searchTree(node.right, list);
        if (node.right != null) searchTree(node.left, list);
        if (node.left == null && node.right == null) list.add(node.val);
    }
}
