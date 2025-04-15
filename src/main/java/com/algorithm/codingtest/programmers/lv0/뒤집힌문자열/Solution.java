package com.algorithm.codingtest.programmers.lv0.뒤집힌문자열;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
