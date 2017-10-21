package com.agile.practice.c100;

public class SecondMinimumValue671 {
	
	public static int seMin;

    public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(findSecondMinimumValue(node));
        System.out.println(findMaxValue(node));
        System.out.println(seMin);
    }

    public static int findSecondMinimumValue(Node<Integer> root) {
        if (root == null) return 100;
        int res = root.data;
        int lv = findSecondMinimumValue(root.left);
        int rv = findSecondMinimumValue(root.right);
        if (lv < res) {
        	res = lv;
        }
        if (rv < res) {
        	res = rv; 
        }
        return res;
    }
    
    public static int findMaxValue(Node<Integer> root) {
        if (root == null) return -1;
        int res = root.data;
        int lv = findMaxValue(root.left);
        int rv = findMaxValue(root.right);
        if (lv > res) res = lv;
        if (rv > res) res = rv;
        return res;
    }

}

