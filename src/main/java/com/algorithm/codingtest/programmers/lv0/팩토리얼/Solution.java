package com.algorithm.codingtest.programmers.lv0.팩토리얼;

public class Solution {
    public int solution(int n) {
        int factorial = 1, count = 1;
        while (true) {
            factorial *= count;
            if (factorial >= n) {
                return factorial == n ? count : count - 1;
            }
            count++;
        }
    }
}
