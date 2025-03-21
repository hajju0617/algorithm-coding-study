package com.algorithm.codingtest.programmers.lv0.원소들의곱과합;

public class Solution {
    public int solution(int[] num_list) {
        int multiplyAll = 1, squareOfSum = 0;
        for (int num : num_list) {
            multiplyAll *= num;
            squareOfSum += num;
        }
        squareOfSum = (int) Math.pow(squareOfSum, 2);
        return multiplyAll < squareOfSum ? 1 : 0;
    }
}
