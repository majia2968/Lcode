package com.leetcode.dev.array;

public class FlippingImage832 {

    public int[][] flipAndInvertImage(int[][] image) {
        //int row = image.length;
        int col = image.length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < col / 2; j++) {
                if (image[i][j] != image[i][col - j - 1]) {
                    image[i][j] ^= 1;
                    image[i][col - j - 1] = image[i][j];
                }
            }
        }
        return image;
    }

}
