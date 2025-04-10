package com.algorithm.codingtest.programmers.lv0.k의개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            int tmp = l;
            while (tmp != 0) {
                if ((tmp % 10) == k) {
                    count++;

                }
                tmp /= 10;
            }
        }
        return count;
    }
}
