package com.agile.practice.c100;

public class SecondMinimumValue671 {
	
	public static long seMin = Long.MAX_VALUE;
	public static int min;

    public static void main(String[] args) {
        BinaryTree  bt = new BinaryTree();
        Node node = bt.buildTree();
        bt.printTree(node);
        System.out.println(findSecondMinimumVal(node));
        System.out.println(min);

    }
    
    public static int findSecondMinimumVal(Node root) {
        min = (Integer) root.data;
        findSecondMinimumValue(root);
        return seMin < Long.MAX_VALUE ? (int) seMin : -1;
    }

    public static void findSecondMinimumValue(Node<Integer> root) {

    	if (root != null) {
    		if (min < root.data && root.data < seMin) {
    			seMin = root.data;
    		}	
    		else if (min > root.data){
    			min = root.data;
    		}
			findSecondMinimumValue(root.left);
			findSecondMinimumValue(root.right);
    	}
    }
    
    public static int findMaxValue(Node<Integer> root) {
        if (root == null) return -1;
        int res = root.data;
        int lv = findMaxValue(root.left);
        int rv = findMaxValue(root.right);
        System.out.println(root.data);
        if (lv > res) res = lv;
        if (rv > res) res = rv;
        return res;
    }

}

