package com.agile.practice.c100.string;

public class ToLowerCase709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLowerCase("HellLLLo"));
	}
	
	public static String toLowerCase(String s) {
		String to = "";
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				char tmp = (char) ((int) c + 32);
				to += tmp;
			}
			else {
				to += c;
			}
			
		}
		return to;
	}

}
