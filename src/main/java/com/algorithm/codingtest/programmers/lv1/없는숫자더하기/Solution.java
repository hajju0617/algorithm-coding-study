package com.algorithm.codingtest.programmers.lv1.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int num : numbers) {
            sum -= num;
        }
        return sum;
    }
}
