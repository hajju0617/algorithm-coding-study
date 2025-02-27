package com.algorithm.codingtest.programmers.lv0.첫번째로나오는음수;

public class Solution {
    public int solution(int[] num_list) {
        int negativeNumIdx = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                negativeNumIdx = i;
                break;
            } else {
                negativeNumIdx = -1;
            }
        }
        return negativeNumIdx;
    }
}
