package com.algorithm.codingtest.programmers.lv0.등차수열의특정한항만더하기;

public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                sum += a + i * d;
            }
        }
        return sum;
    }
}
