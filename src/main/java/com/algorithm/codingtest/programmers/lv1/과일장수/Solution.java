package com.algorithm.codingtest.programmers.lv1.과일장수;

import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int sum = 0, leftover = score.length % m;
        for (int i = score.length - m; i >= leftover; i -= m) {
            sum += score[i] * m;
        }
        return sum;
    }
}
