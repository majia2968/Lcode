package com.agile.practice.c100.easy;

public class ConstructStringBT606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        if (t.left == null && t.right == null) return String.valueOf(t.val);
        StringBuffer s = new StringBuffer();
    	tree2str1(t, s);
    	return s.substring(1, s.length()-1);
    }
    
    public void tree2str1(TreeNode t, StringBuffer s) {
        if (t == null) return ;
        s.append("(" + t.val);
        if (t.left == null && t.right != null) s.append("()");
        tree2str1(t.left, s);
        tree2str1(t.right, s);
        s.append(")");
    }

}
