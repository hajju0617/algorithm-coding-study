package com.algorithm.codingtest.programmers.lv2.숫자의표현;

public class Solution {
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }

        int count = 0;
        int start = 1, end = 1, sum = 1;

        while (start <= (n / 2)) {
            if (sum == n) {
                count++;
            }

            if (sum >= n) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        return count + 1;   // n 자기 자신의 값도 포함시키려고 +1
    }
}
