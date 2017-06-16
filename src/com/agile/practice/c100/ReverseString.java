package com.agile.practice.c100;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
		String s = "how are you where is the home";
		String[] arr = s.split("\\s+");
		String ss = "";
		for (int i = 0; i < arr.length; i++) {
			ss += reverseString(arr[i]) + " ";
		}
		System.out.println(ss);
		String sss = "how   are   you where is the home";
		String[] arr2 = sss.split("\\s+");
		String ssw = "";
		for (int i = 0; i < arr.length; i++) {
			ssw += arr2[i];
			System.out.println(arr2[i]);
			System.out.println(arr2[0]);
		}
		System.out.println(ssw);
	}
	
	public static String reverseString(String s) {
		if (s == null || s.length() == 0) return s;
		return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
	}

}
