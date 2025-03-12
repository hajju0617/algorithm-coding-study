package com.algorithm.codingtest.programmers.lv0.구로나눈나머지;

public class Solution {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum % 9;
    }
}
