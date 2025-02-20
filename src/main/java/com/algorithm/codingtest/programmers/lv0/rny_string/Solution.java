package com.algorithm.codingtest.programmers.lv0.rny_string;

public class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public String solution2(String rny_string) {
        String answer = "";

        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                answer += "rn";
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
