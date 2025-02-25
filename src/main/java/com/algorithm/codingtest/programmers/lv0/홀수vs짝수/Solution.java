package com.algorithm.codingtest.programmers.lv0.홀수vs짝수;

public class Solution {
    public int solution(int[] num_list) {
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }
        return evenSum >= oddSum ? evenSum : oddSum;
                // = Math.max(evenSum, oddSum);
    }
}
