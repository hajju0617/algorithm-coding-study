package com.algorithm.codingtest.programmers.lv0.점의위치구하기;

public class Solution {
    public int solution(int[] dot) {
        boolean isXPositive = dot[0] > 0;
        boolean isYPositive = dot[1] > 0;

        if (isXPositive) {
            if (isYPositive) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (isYPositive) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
