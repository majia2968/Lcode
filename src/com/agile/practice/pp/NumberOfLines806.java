package com.agile.practice.pp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfLines806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
	    //String S = "bbbcccdddaaa";
	    int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
	    String S = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(Arrays.toString(numberOfLines(widths, S)));
	}
	
    public static int[] numberOfLines(int[] widths, String S) {
    	int[] az = new int[2];
    	Map map = new HashMap();
    	String word = "abcdefghijklmnopqrstuvwxyz";
    	for (int i = 0; i < word.length(); i++) {
    		map.put(word.charAt(i), widths[i]);
    	}
    	int sum = 0;
    	int line = 1;
    	for (char c : S.toCharArray()) {
    		if (sum + (int) map.get(c) <= 100) {
    			sum += (int) map.get(c);
    		}
    		else {
    			line++;
    			sum = (int) map.get(c);
    		}
    		
    	}
    	az[0] = line;
    	az[1] = sum;
        return az;
    }

}
