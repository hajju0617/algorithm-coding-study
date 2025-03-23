package com.algorithm.codingtest.programmers.lv0.이어붙인수;

public class Solution {
    public int solution(int[] num_list) {
        int oddNum = 0, evenNum = 0, count = 10;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum = evenNum * count + num_list[i];
            } else {
                oddNum = oddNum * count + num_list[i];
            }
        }
        return oddNum + evenNum;
    }
}
