package com.algorithm.codingtest.programmers.lv0.두수의연산값비교하기;

public class Solution {
    public int solution(int a, int b) {
        return Integer.parseInt("" + a + b) >= 2 * a * b ? Integer.parseInt("" + a + b) : 2 * a * b;
    }
}
