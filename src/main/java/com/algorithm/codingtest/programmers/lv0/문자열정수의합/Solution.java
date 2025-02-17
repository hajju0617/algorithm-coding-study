package com.algorithm.codingtest.programmers.lv0.문자열정수의합;

public class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum += Character.getNumericValue((num_str.charAt(i)));
        }
        return sum;
    }
}
