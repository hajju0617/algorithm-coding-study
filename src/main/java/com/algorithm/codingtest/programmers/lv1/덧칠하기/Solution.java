package com.algorithm.codingtest.programmers.lv1.덧칠하기;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0, location = 0;
        for (int i = 0; i < section.length; i++) {
            if (location < section[i]) {
                location = section[i] + m - 1;
                count++;
            }
            if (location > n) {
                break;
            }
        }
        return count;
    }
}
