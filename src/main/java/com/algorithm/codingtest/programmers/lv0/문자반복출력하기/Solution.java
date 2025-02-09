package com.algorithm.codingtest.programmers.lv0.문자반복출력하기;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += String.valueOf(my_string.charAt(i)).repeat(n);
            // repeat() : 문자열 반복 메서드.
        }
        return answer;
    }
}
