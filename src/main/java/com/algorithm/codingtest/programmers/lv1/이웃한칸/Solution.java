package com.algorithm.codingtest.programmers.lv1.이웃한칸;

public class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0, boardWH = board.length;
        int[] mw = {0, 0, -1, 1};
        int[] mh = {1, -1, 0, 0};

        for (int i = 0; i < mw.length; i++) {
            int w_check = w - mw[i], h_check = h - mh[i];
            if (w_check >= 0 && w_check < boardWH && h_check >= 0 && h_check < boardWH) {
                if (board[h_check][w_check].equals(board[h][w])) {
                    count++;
                }
            }
        }
        return count;
    }
}
