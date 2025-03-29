package com.algorithm.codingtest.programmers.lv0.이차원배열대각선순회하기;

public class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            if (i > k) {
                break;
            }
            for (int j = 0; j < board[0].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}
