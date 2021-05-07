package com.agile.practice.easy;

public class BitCharacters717 {

    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;

        while ( i < n - 1) {
            if (bits[i] == 0) {
                ++i;
            }
            else {
                i += 2;
            }
        }
        return i == n - 1;
    }


}
