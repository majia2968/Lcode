package com.agile.practice.c100;

public class NumberCompliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(~5);
//		System.out.println(Integer.highestOneBit(5));
//		
//		System.out.println(findComplement(5));
//		System.out.println(findComplement1(5));
//		System.out.println(Integer.toBinaryString(121 >> 1));
//		System.out.println(Integer.toBinaryString(121 >>> 1));
//		System.out.println(Integer.toBinaryString(-1));
//		System.out.println(Integer.toBinaryString(-3 >> 1));
//		System.out.println(Integer.toBinaryString(-3 >>> 1));
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(Integer.toBinaryString(-5>>1));
		System.out.println(Integer.toBinaryString(-5>>>1));
	}
	
    public static int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;
    }
    
    public static int findComplement1(int num) {
        return ~num & (Integer.highestOneBit(num)-1);
    }
	
	public static int numberCom(int i) {
		
		return i;
	}
	
	public static String convert(int i) {
		StringBuilder sb = new StringBuilder();
		if (i == 0) return "0";
		while (i >= 0) {
			sb.append(i%2);
			i /= 2;
		}
		return sb.reverse().toString();
	}

}
