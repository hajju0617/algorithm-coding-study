package com.algorithm.codingtest.programmers.lv0.피자나눠먹기2;

public class Solution {
    public int solution(int n) {
        int p = 6, count = 6;
        while (true) {
            if (count % n == 0) {
                break;
            }
            count += 6;
        }
        return count / p;
    }
}
