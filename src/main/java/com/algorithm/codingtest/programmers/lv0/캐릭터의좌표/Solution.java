package com.algorithm.codingtest.programmers.lv0.캐릭터의좌표;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] origin = {0, 0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String str : keyinput) {
            switch (str) {
                case "left" : if (origin[0] > -xLimit) {
                    origin[0]--;
                }
                    break;
                case "right" : if (origin[0] < xLimit) {
                    origin[0]++;
                }
                    break;
                case "up" : if (origin[1] < yLimit) {
                    origin[1]++;
                }
                    break;
                case "down" : if (origin[1] > -yLimit) {
                    origin[1]--;
                }
                    break;
            }
        }
        return origin;
    }
}
