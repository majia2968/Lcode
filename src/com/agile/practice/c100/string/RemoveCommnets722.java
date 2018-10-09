package com.agile.practice.c100.string;

import java.util.Arrays;

public class RemoveCommnets722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
		System.out.println(removeComments(source));
		System.out.println(Arrays.toString(source));
	}
	
    public static String[] removeComments(String[] source) {
    	int i = 0;
    	boolean ifCommentsBlock = false;
        for (String s : source) {
    		if (s.trim().startsWith("//")) source[i] = " ";
        	if (s.endsWith("*/")) {
        		source[i] = " ";
        		ifCommentsBlock = false;
        	}
        	if (ifCommentsBlock) {
        		source[i] = " ";
        	}
        	else {
        		if (s.startsWith("/*")) {
        			source[i] = " ";
        			if (!s.endsWith("*/")) ifCommentsBlock = true;
        		}
        	}
        	i++;
        }
        return source;
    }

}
