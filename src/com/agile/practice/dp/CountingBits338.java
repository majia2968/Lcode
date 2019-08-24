package com.agile.practice.dp;

import java.sql.Array;
import java.util.Arrays;

public class CountingBits338 {

    public static void main(String[] args) {
        int num = 9;
        System.out.println("Hello, world: ");
        System.out.println(countBinary(5));
        System.out.println(Arrays.toString(countBits(5)));

    }

    public static int[] countBits(int num) {
        int[] res = new int[num+1];
        int pow2 = 1,before =1;
        for(int i=1;i<=num;i++){
            if (i == pow2){
                before = res[i] = 1;
                pow2 <<= 1;
            }
            else{
                res[i] = res[before] + 1;
                before += 1;
            }
        }
        return res;
    }

    public static int countBinary(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 != 0) count++;
            num = num/2;
        }
        return count;
    }
}
