package com.algorithm.codingtest.programmers.lv0.n보다커질때까지더하기;

public class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            if (sum > n) {
                break;
            }
        }
        return sum;
    }
}
