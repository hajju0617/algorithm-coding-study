package com.algorithm.codingtest.programmers.lv0.짝수는싫어요;

public class Solution {
    public int[] solution(int n) {
        int length = (n + 1) / 2;
        int[] answer = new int[length];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[count++] = i;
            }
        }
        return answer;
    }
}
