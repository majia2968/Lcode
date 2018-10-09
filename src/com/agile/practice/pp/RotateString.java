package com.agile.practice.pp;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotateString("", ""));
	}
	
	public static boolean rotateString(String a, String b) {
		if (a.isEmpty() && b.isEmpty()) return true;
		if (a.isEmpty() || b.isEmpty()) return false;
		char[] ch = a.toCharArray();
		for (int i = 0; i< ch.length; i++) {
			String sub = a.substring(0, i);
			String rest = a.substring(i);
			if (b.startsWith(rest)) {
				if ((rest+sub).equals(b)) return true;
			}
		}
		return false;
	}

}
