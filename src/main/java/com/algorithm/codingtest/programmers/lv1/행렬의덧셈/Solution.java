package com.algorithm.codingtest.programmers.lv1.행렬의덧셈;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] numArr = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                numArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return numArr;
    }
}
