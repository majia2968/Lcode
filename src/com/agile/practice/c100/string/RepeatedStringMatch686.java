package com.agile.practice.c100.string;

public class RepeatedStringMatch686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedStringMatch("abcd", "cdabcdabe"));
	}
	
    public static int repeatedStringMatch(String A, String B) {
        StringBuffer ss = new StringBuffer();
        int i = 0;
        while (!ss.toString().contains(B)) {
        	ss.append(A);
        	i++;
        	if (ss.toString().length() > 10000) return -1;
        }
        return i;
    }

}