package com.algorithm.codingtest.programmers.lv0.배열만들기1;

public class Solution {
    public int[] solution(int n, int k) {
        int[] numArr = new int[n / k];
        int count = 0;
        for (int i = 1; i <= n / k; i++) {
            numArr[count++] = k * i;
        }
        return numArr;
    }
}
