package com.algorithm.codingtest.programmers.lv1.콜라츠추측;

public class Solution {
    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        long n = num;
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
            if (count == 500) {
                return -1;
            }
        }
        return count;
    }
}
