package com.agile.practice.c100.tree;

public class complexNumberMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void numMultiply(String s1, String s2) {
		String[] a = s1.split("\\+");
		String[] b = s2.split("\\+");
		int a1 = Integer.parseInt(a[0]);
		int a2 = Integer.parseInt(a[1].replace("i", ""));
		int b1 = Integer.parseInt(b[0]);
		int b2 = Integer.parseInt(b[1].replace("i", ""));
		int a1b1 = a1*b1;
		int a2b2 = a2*b2;
		int a1b2a2b1 = a1*b2 + a2*b1;
		
		System.out.println(a1b1 + (-1*a2b2) + " " + a1b2a2b1 + "i");
	}

}
