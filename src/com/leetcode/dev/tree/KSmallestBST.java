package com.leetcode.dev.tree;

import com.leetcode.commons.TreeNode;

import java.util.Stack;

public class KSmallestBST {

    class Solution {

        /***
         *
         * @param root inorder travel to get a sorted arrayList
         * @param k
         * @return
         */
        public int kthSmallest(TreeNode root, int k) {
            if (root == null) return -1;
            Stack<TreeNode> ss = new Stack<>();
            TreeNode p = root;
            int result = 0;
            ss.push(p);
            while (!ss.empty() || p != null) {
                if (p != null) {
                    ss.push(p);
                    p = p.left;
                }
                else {
                    TreeNode t = ss.pop();
                    k--;
                    if (k == 0) {
                        result = t.val;
                    }
                    p = t.right;
                }
            }
            return result;
        }
    }
}
