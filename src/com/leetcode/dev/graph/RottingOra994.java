package com.leetcode.dev.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOra994 {

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int []> que = new LinkedList<>();
        int freshCount = 0;

        for ( int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                else if (grid[i][j] == 2){
                    que.offer(new int[]{i, j});
                }
            }
        }
        return -1;
    }

}
