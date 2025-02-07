package com.algorithm.codingtest.programmers.lv0.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int num = 0;
        while (n > 0) {
            num += n % 10;
            n = n / 10;
        }
        return num;
    }
}
