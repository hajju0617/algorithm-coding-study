package com.algorithm.codingtest.programmers.lv0.영어가싫어요;

public class Solution {
    public long solution(String numbers) {
        String[] strNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strNumbers.length; i++) {
            numbers = numbers.replaceAll(strNumbers[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
