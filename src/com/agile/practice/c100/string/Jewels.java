package com.agile.practice.c100.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jewels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch = new int[128];
		ch['a'] = 1;
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(Arrays.toString(ch));
	}
	
    public static int numJewelsInStones(String J, String S) {
        int[] ch = new int[128];
        for (final char c : J.toCharArray())
            ch[c] = 1;
    	int sum = 0;
        for (final char c : S.toCharArray())
            sum += ch[c];
    	return sum;
    }
    
    public static int numJ(String s) {
        String rowOne = "qwertyuiopQWERTYUIOP";
        String rowTwo = "asdfghjklASDFGHJKL";
        String rowThree = "zxcvbnmZXCVBNM";
        Set<String> s1 = new HashSet<>(Arrays.asList(rowOne));
        Set<String> s2 = new HashSet<>(Arrays.asList(rowTwo));
        Set<String> s3 = new HashSet<>(Arrays.asList(rowThree));
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean f1, f2, f3;
        for (int i = 0; i < ss.length; i++) {
        	for (char c : ss[i].toCharArray()) {
        		if (s1.contains(c)) {
        			f1 = true;
        		}
        		if (s2.contains(c)) {
        			f2 = true;
        		}
        		if (s3.contains(c)) {
        			f3 = true;
        		}
        				
        	}
        	//if ((^f1 & f2 & f3) ||(f1 & f2 & f3) || (f1 & f2 & f3)) sb.append(ss[i]);
        }
        return 0;
    }

}
