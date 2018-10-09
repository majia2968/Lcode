package com.agile.practice.c100.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
    public static int uniqueMorseRepresentations(String[] words) {
    	Set<String> temp = new HashSet<String>();
    	String[] sh = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	for (String word : words) {
    		StringBuilder tmp = new StringBuilder();
    		for (char c : word.toCharArray()) {
    			tmp.append(sh[c-97]);
    		}
    		temp.add(tmp.toString());
    	}
        return temp.size();
    }

}
