package com.algorithm.codingtest.programmers.lv1.정수제곱근판별;

public class Solution {
    public long solution(long n) {
        long result = (long) Math.sqrt(n);
        return (result * result == n) ? (long) Math.pow(result + 1, 2) : -1;
    }
}
