package com.algorithm.codingtest.programmers.lv1.숫자문자열과영단어;

public class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
