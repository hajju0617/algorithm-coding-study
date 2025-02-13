package com.algorithm.codingtest.programmers.lv0.홀짝에따라다른값반환하기;

public class Solution {
    public int solution(int n) {
        int evenNumSum = 0, oddNumSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenNumSum += i * i;
            } else {
                oddNumSum += i;
            }
        }
        return (n % 2 == 0) ? evenNumSum : oddNumSum;
    }
}
