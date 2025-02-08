package com.algorithm.codingtest.programmers.lv0.특별한이차원배열1;

public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
