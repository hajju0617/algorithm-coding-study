package com.algorithm.codingtest.programmers.lv0.정수찾기;

public class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1;
            }
        }
        return 0;
    }
}
