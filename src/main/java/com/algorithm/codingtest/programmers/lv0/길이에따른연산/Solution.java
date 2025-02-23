package com.algorithm.codingtest.programmers.lv0.길이에따른연산;

public class Solution {
    public int solution(int[] num_list) {
        int total = num_list.length >= 11 ? 0 : 1;

        if (total == 0) {
            for (int num : num_list) {
                total += num;
            }
        } else {
            for (int num : num_list) {
                total *= num;
            }
        }
        return total;
    }
}
