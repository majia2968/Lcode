package com.agile.practice.pp;

import java.util.Stack;

public class JudgeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeCircle("LDRRLRUULR"));
	}
	
    public static boolean judgeCircle(String moves) {
        int move = 0;
        int hmove = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') move += 1;
            if (moves.charAt(i) == 'L') hmove += 1;
            if (moves.charAt(i) == 'D') move += -1;
            if (moves.charAt(i) == 'R') hmove += -1;
        }
        
        return (move == 0 && hmove == 0) ? true : false;
    }
    
    public static boolean judgeCircle2(String moves) {
        int move = 0;
        int hmove = 0;
        Stack stack = new Stack();
        for (int i = 0; i < moves.length(); i++) {
        	
        }
        
        return (move == 0 && hmove == 0) ? true : false;
    }

}
