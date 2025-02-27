package com.algorithm.codingtest.programmers.lv1.두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
        long minNum = Math.min(a, b);
        long maxNum = Math.max(a, b);

        return ((maxNum - minNum + 1) * (minNum + maxNum) / 2);
    }
}
