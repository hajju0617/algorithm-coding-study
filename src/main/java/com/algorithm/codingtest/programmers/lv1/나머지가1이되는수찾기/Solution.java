package com.algorithm.codingtest.programmers.lv1.나머지가1이되는수찾기;

public class Solution {
    public int solution(int n) {
        int num = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                num = i;
                break;
            }
        }
        return num;
    }
}
