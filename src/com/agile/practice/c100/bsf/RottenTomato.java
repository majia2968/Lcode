package com.agile.practice.c100.bsf;


import java.util.LinkedList;
import java.util.Queue;

public class RottenTomato {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> que = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int step = 0;
        int fresh = 0;
        int[][] st = {{-1, 0}, {1,0}, {0,-1}, {0,1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                else if (grid[i][j] == 2) {
                    que.offer(new int[] {i, j});
                }
            }
        }
        while (!que.isEmpty() && fresh > 0) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int[] tmp = que.poll();
                for (int[] direction : st) {
                    int diX = direction[0] + tmp[0];
                    int diY = direction[1] + tmp[1];
                    if(diX < 0 || diY < 0 || diX >= m || diY >= n || grid[diX][diY] != 1) continue;
                    que.offer(new int[] {diX, diY});
                    grid[diX][diY] = 2;
                    fresh--;
                }
            }

            step++;
        }
        return fresh == 0 ? step : -1;
    }
}
