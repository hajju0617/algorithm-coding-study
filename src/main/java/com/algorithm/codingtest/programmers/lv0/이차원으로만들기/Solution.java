package com.algorithm.codingtest.programmers.lv0.이차원으로만들기;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] numArr = new int[num_list.length / n][n];
        int count = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                numArr[i][j] = num_list[count++];
            }
        }
        return numArr;
    }
}
