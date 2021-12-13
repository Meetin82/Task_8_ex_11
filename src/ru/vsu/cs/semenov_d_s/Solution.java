package ru.vsu.cs.semenov_d_s;

public class Solution {

    public int[][] rotateArrayNinetyDegrees(int[][] arr2) {
        int[][] newArr2 = new int[arr2[0].length][arr2.length];
        for (int r = 0; r < arr2[0].length; r++) {
            int temp = arr2.length;
            for (int c = 0; c < arr2.length; c++) {
                temp--;
                int temp2 = arr2[temp][r];
                newArr2[r][c] = temp2;
            }
        }
        return newArr2;
    }
}