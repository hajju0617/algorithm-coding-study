package com.algorithm.codingtest.programmers.lv0.다항식더하기;

public class Solution {
    public String solution(String polynomial) {
        int constant = 0, coefficient = 0;      // constant : 상수항, coefficient : 계수.

        String[] strArr = polynomial.replace(" ", "").split("\\+");
        // 공백 제거, + 연산 기호를 기준으로 문자열 분리.
        // Ex. "3x + x + 4 + 2x" --> "3x+x+4+2x" --> ["3x", "x", "4", "2x"]
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("x")) {
                coefficient += strArr[i].equals("x") ? 1 : Integer.parseInt(strArr[i].replace("x", ""));
            } else {
                constant += Integer.parseInt(strArr[i]);
            }
        }
        if (coefficient == 0) {
            return String.valueOf(constant);
        } else if (constant == 0) {
            return (coefficient == 1) ? "x" : coefficient + "x";
        } else {
            return (((coefficient == 1) ? "x" : coefficient + "x") + " + " + constant);
        }
    }
}
