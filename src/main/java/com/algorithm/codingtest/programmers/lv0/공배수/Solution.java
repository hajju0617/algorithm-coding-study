package com.algorithm.codingtest.programmers.lv0.공배수;

public class Solution {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
