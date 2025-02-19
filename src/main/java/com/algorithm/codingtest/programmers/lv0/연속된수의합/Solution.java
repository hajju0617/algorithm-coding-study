package com.algorithm.codingtest.programmers.lv0.연속된수의합;

import java.util.Arrays;

public class Solution {
    public int[] solution(int num, int total) {
        int firstTerm = (2 * total - (num * (num - 1))) / (2 * num);    // 등차수열 합 공식.
        int[] arithmeticSequence = new int[num];

        for (int i = 0; i < num; i++) {
            arithmeticSequence[i] += firstTerm + i;
        }
        Arrays.sort(arithmeticSequence);
        return arithmeticSequence;
    }
}
