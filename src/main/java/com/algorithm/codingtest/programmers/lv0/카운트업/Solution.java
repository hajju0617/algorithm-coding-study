package com.algorithm.codingtest.programmers.lv0.카운트업;

public class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] numArr = new int[end_num - start_num + 1];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = start_num++;
        }
        return numArr;
    }
}
