package com.algorithm.codingtest.programmers.lv0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        int index = ((k - 1) * 2) % numbers.length;
        return numbers[index];
    }
}
