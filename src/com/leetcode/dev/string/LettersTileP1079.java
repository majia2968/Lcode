package com.leetcode.dev.string;

import java.util.Arrays;

public class LettersTileP1079 {

    public static void main(String[] arg) {
        LettersTileP1079 lettersTileP1079 = new LettersTileP1079();
        String tiles = "AAABBC";
        System.out.print(lettersTileP1079.numTilePossibilities(tiles));
    }

    public int numTilePossibilities(String tiles) {
        int[] tmp = new int[26];
        for (int i = 0; i < tiles.length(); i++)
        {
            tmp[tiles.charAt(i) - 'A']++;
        }
        System.out.println(Arrays.toString(tmp));
        return dfs(tmp);
    }

    int dfs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) continue;
            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        return sum;
    }
}
