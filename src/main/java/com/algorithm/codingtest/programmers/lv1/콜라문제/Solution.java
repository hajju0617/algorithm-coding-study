package com.algorithm.codingtest.programmers.lv1.콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int exchangedCount = 0, currentCount = 0, totalExchanged = 0;
        while (a <= n) {
            exchangedCount = n / a * b;
            totalExchanged += exchangedCount;
            currentCount = n % a + exchangedCount;
            n = currentCount;
        }
        return totalExchanged;
    }
}
