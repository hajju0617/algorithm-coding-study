package com.algorithm.codingtest.programmers.lv1.하샤드수;

public class Solution {
    public boolean solution(int x) {
        int digitSum = 0, originalNum = x;

        while (x != 0) {
            digitSum += x % 10;
            x /= 10;
        }
        return originalNum % digitSum == 0;
    }
}
