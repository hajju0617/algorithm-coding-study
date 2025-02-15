package com.algorithm.codingtest.programmers.lv0.가위바위보;

public class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        char scissors = '2', rock = '0', paper = '5';
        for (char c : rsp.toCharArray()) {
            if (scissors == c) {
                answer.append(rock);
            } else if (rock == c) {
                answer.append(paper);
            } else {
                answer.append(scissors);
            }
        }
        return answer.toString();
    }
}
