package com.algorithm.codingtest.programmers.lv0.합성수찾기;

public class Solution {
    public int solution(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (j > i) {
                    break;
                }
                if (i % j == 0) {
                    count++;
                    if (count == 3) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
