package com.algorithm.codingtest.programmers.lv1.소수찾기;

public class Solution {
    public static int solution(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
