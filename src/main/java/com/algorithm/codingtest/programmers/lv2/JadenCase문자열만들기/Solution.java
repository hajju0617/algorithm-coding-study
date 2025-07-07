package com.algorithm.codingtest.programmers.lv2.JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String lowerCase = s.toLowerCase();
        boolean isFirstLetter = true;

        for (char c : lowerCase.toCharArray()) {
            if (isFirstLetter) {
                if (Character.isLetter(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                isFirstLetter = false;
            } else {
                sb.append(c);
            }

            if (c == ' ') {
                isFirstLetter = true;
            }
        }
        return sb.toString();
    }
}
