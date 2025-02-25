package com.algorithm.codingtest.programmers.lv0.n번째원소까지;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] += num_list[i];
        }
        return numArr;
    }
}
