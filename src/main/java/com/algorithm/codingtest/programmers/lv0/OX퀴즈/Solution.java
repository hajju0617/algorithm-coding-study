package com.algorithm.codingtest.programmers.lv0.OX퀴즈;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");

            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);

            if ("+".equals(str[1])) {
                answer[i] = (num1 + num2 == result) ? "O" : "X";
            } else {
                answer[i] = (num1 - num2 == result) ? "O" : "X";
            }
        }
        return answer;
    }
}
