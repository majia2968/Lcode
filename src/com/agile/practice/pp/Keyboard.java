package com.agile.practice.pp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.print(Arrays.toString(findWords(words)));
	}
	
    public static String[] findWords(String[] words) {
    	
    	if(words == null || words.length == 0 ){
    		return words;
        }
    	
        String top = "qwertyuiopQWERTYUIOP";
        String mid = "asdfghjklASDFGHJKL";
        String bot = "zxcvbnmZXCVBNM";
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : top.toCharArray()) {
        	map.put(c, 1);
        }
        for (char c : mid.toCharArray()) {
        	map.put(c, 2);
        }
        for (char c : bot.toCharArray()) {
        	map.put(c, 3);
        }
        ArrayList<String> al = new ArrayList<String>();
    	for (String s : words) {
    		 if (s == null || s.length() == 0) continue;
    		 int flag = map.get(s.charAt(0));
    		 for (char c : s.toCharArray()) {
    			 if (flag != map.get(c)) {
    				 flag = -1;
    			 }
    		 }
    		 if (flag != -1) al.add(s);
    	}
    	return al.toArray(new String[al.size()]);
    }

}
