package com.algorithm.codingtest.programmers.lv0.삼육구게임;

public class Solution {
    public int solution(int order) {
        int count = 0;
        while (order != 0) {
            int num = order % 10;
            if (num % 3 == 0 && num != 0) {
                count++;
            }
            order /= 10;
        }
        return count;
    }
}
