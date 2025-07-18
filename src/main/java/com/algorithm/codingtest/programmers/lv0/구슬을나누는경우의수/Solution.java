package com.algorithm.codingtest.programmers.lv0.구슬을나누는경우의수;

public class Solution {
    public int solution(int balls, int share) {
        long result = 1;
        for (int i = 1; i <= share; i++) {
            result *= (balls - i + 1);
            result /= i;
        }
        return (int) result;
    }
}
