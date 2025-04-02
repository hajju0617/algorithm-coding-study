package com.algorithm.codingtest.programmers.lv0.날짜비교하기;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                return 1;
            }
            if (date1[i] > date2[i]) {
                return 0;
            }
        }
        return 0;
    }
}
