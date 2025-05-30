package com.algorithm.codingtest.programmers.lv0.칠의개수;

public class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int num : array) {
            while (num > 0) {
                if (num % 10 == 7) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
